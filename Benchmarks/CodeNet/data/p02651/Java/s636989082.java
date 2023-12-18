import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
  //↓見なくていいよ！ここから------------------------------------------
  static public class InputIterator{
    ArrayList<String> inputLine = new ArrayList<String>(1024);
    int index = 0; int max;
    InputIterator(){
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      while(true){
        String read;
        try{
          read = br.readLine();
        }catch(IOException e){
          read = null;
        }
        if(read != null){
          inputLine.add(read);
        }else{
          break;
        }
      }
      max = inputLine.size();
    }
    public boolean hasNext(){return (index < max);}
    public String next(){
      if(hasNext()){
        String returnStr = inputLine.get(index);
        index++;
        return returnStr;
      }else{
        throw new IndexOutOfBoundsException("これ以上入力はないよ。");
      }
    }
  }
  
  static InputIterator ii = new InputIterator();//リアクティブでは使えないので諦めてScanner使うこと
  static PrintWriter out = new PrintWriter(System.out);
  static void flush(){out.flush();}
  static void myout(Object t){out.println(t);}
  static void myerr(Object t){System.err.println(t);}
  static String next(){return ii.next();}
  static int nextInt(){return Integer.parseInt(next());}
  static long nextLong(){return Long.parseLong(next());}
  static ArrayList<String> nextStrArray(){return myHanSpSplit(next());}
  static ArrayList<String> myHanSpSplit(String str){return new ArrayList<String>(Arrays.asList(str.split(" ")));}
  static ArrayList<String> nextCharArray(){return mySingleSplit(next());}
  static ArrayList<String> mySingleSplit(String str){return new ArrayList<String>(Arrays.asList(str.split("")));}
  static ArrayList<Integer> nextIntArray(){
    ArrayList<Integer> ret = new ArrayList<Integer>();
    ArrayList<String> input = nextStrArray();
    for(int i = 0; i < input.size(); i++){
      ret.add(Integer.parseInt(input.get(i)));
    }
    return ret;
  }
  static ArrayList<Long> nextLongArray(){
    ArrayList<Long> ret = new ArrayList<Long>();
    ArrayList<String> input = nextStrArray();
    for(int i = 0; i < input.size(); i++){
      ret.add(Long.parseLong(input.get(i)));
    }
    return ret;
  }
  static String kaigyoToStr(String[] list){return String.join("\n",list);}
  static String kaigyoToStr(ArrayList<String> list){return String.join("\n",list);}
  static String hanSpToStr(String[] list){return String.join(" ",list);}
  static String hanSpToStr(ArrayList<String> list){return String.join(" ",list);}
  public static void main(String[] args){
    solve();
    flush();
  }
  //↑見なくていいよ！ここまで------------------------------------------
  static public void solve(){//ここがメイン関数代わり
    int t = nextInt();
    for(int i = 0; i < t; i++){
      int N = nextInt();
      ArrayList<Long> list = nextLongArray();
      ArrayList<String> turn = nextCharArray();
      HashSet<Long> oneSet = new HashSet<Long>();
      HashSet<Long> zeroSet = new HashSet<Long>();
      for(int j = 0; j < N; j++){
        if(turn.get(j).equals("1")){
          if(oneSet.size() > 0){
            Iterator it = oneSet.iterator();
            ArrayList<Long> tmp = new ArrayList<Long>(100);
            while(it.hasNext()){
              long newVal = list.get(j) ^ (long)it.next();
              if(newVal != 0){
                tmp.add(newVal);
              }
            }
            it = null;
            for(int k = 0; k < tmp.size(); k++){
              oneSet.add(tmp.get(k));
            }
            tmp = null;
          }
          oneSet.add(list.get(j));
        }else{
          if(zeroSet.size() > 0){
            ArrayList<Long> tmp = new ArrayList<Long>(100);
            Iterator it = zeroSet.iterator();
            while(it.hasNext()){
              long newVal = list.get(j) ^ (long)it.next();
              if(newVal != 0){
                tmp.add(newVal);
              }
            }
            it = null;
            for(int k = 0; k < tmp.size(); k++){
              zeroSet.add(tmp.get(k));
            }
            tmp = null;
          }
          zeroSet.add(list.get(j));
        }
      }
      Iterator oneIt = oneSet.iterator();
      boolean isOK = false;
      while(oneIt.hasNext()){
        long val = (long)oneIt.next();
        if(!zeroSet.contains(val)){
          myout(1);
          isOK = true;
          break;
        }
      }
      if(!isOK){
        myout(0);
      }
      
    }
  }
  //Method addition frame start

  //Method addition frame end
}
