import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    int n = stoi(readL());
    long a[][] = new long[n][2];
    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    long count=0;
    for(int i=0;i<n;i++){
      a[i][0]=readLong();a[i][1]=readLong();
      list.add(new ArrayList<Integer>());
      list.get(i).add(i);
    }
    count = n;
    ArrayList<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>();
    int listn=0;
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        if(a[i][0]*a[j][0]+a[i][1]*a[j][1]!=0){
          tmp.add(new ArrayList<Integer>());
          tmp.get(listn).add(i);tmp.get(listn).add(j);
          listn++;
        }
      }
    }
    list = new ArrayList<>(tmp);
    while(list.size()>0){
      listn=0;
      tmp.clear();
      count = (count+list.size())%1000000007;
      for(int i=0;i<list.size()-1;i++){
        for(int j=i+1;j<list.size();j++){
          if(itti(list.get(i),list.get(j))){
            ArrayList<Integer> tt = new ArrayList<Integer>(list.get(i));
            tt.add(list.get(j).get(list.get(j).size()-1));
            if(decide(list,tt)){
              tmp.add(tt);
            }
          }
        }
      }
      list = new ArrayList<>(tmp);
    }
    pl(count+"");
  }

  public static boolean itti(ArrayList<Integer> a,ArrayList<Integer> b){
    int k = a.size()-1;
    for(int i=0;i<k;i++){
      if(a.get(i)!=b.get(i)){
        return false;
      }
    }
    return true;
  }

  public static boolean decide(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> tmp){
    int n = tmp.size();
    int a[]=new int[tmp.size()];
    for(int i=0;i<n-1;i++){
      a[i]=1;
    }
    a[n-1]=0;
    for(int ii=0;ii<n;ii++){
      ArrayList<Integer> tmpp = new ArrayList<Integer>();
      for(int i=0;i<n;i++){
        if(a[i]==1){
          tmpp.add(i);
        }
      }
      boolean flg = false;
      for(ArrayList<Integer>ll:list){
        if(equal(ll,tmpp)){
          flg=true;break;
        }
      }
      if(!flg){
        return false;
      }
      idou(a);
    }
    return true;
  }

  public static void idou(int a[]){
    int n = a.length;
    for(int i=n-1;i>0;i--){
      if(a[i]==0){
        a[i]=1;
        a[i-1]=0;
        break;
      }
    }
  }

  public static boolean equal(ArrayList<Integer>a,ArrayList<Integer>b){
    for(int i=0;i<a.size();i++){
      if(a.get(i)!=b.get(i)){
        return false;
      }
    }
    return true;
  }

  static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
  public static String readL(){
    try{
      return br.readLine();
    }catch(IOException e){
      e.printStackTrace();
      return "";
    }
  }
  public static String readS(){
    StringBuilder sb = new StringBuilder();
    while(true){
      try{
        int k = br.read();
        if(k==-1||(char)k==' '||(char)k=='\n'){break;}
        sb.append((char)k);
      }catch(IOException e){
        e.printStackTrace();
      }
    }
    return sb.toString();
  }
  public static int readI(){
    return stoi(readS());
  }
  public static long readLong(){
    return stol(readS());
  }
  public static String[] readSs(){
    return readL().split(" ");
  }
  public static int[] readIs(){
    return stoi(readSs());
  }
  public static int stoi(String s){
    return Integer.parseInt(s);
  }
  public static long stol(String s){
    return Long.parseLong(s);
  }
  public static int[] stoi(String s[]){
    int a[]=new int[s.length];
    for(int i=0;i<s.length;i++){
      a[i]=stoi(s[i]);
    }
    return a;
  }
  public static String itos(int i){
    return String.valueOf(i);
  }
  public static String[] itos(int[] a){
    String s[]=new String[a.length];
    for(int i=0;i<a.length;i++){
      s[i]=itos(a[i]);
    }
    return s;
  }
  public static String ctos(char c){
    return String.valueOf(c);
  }
  public static String cstos(char[] c){
    return new String(c);
  }
  public static char stoc(String s){
    return s.charAt(0);
  }
  public static char[] stocs(String s){
    return s.toCharArray();
  }
}
