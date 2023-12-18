import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    int n = readI(),m=readI();
    ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
    for(int i=0;i<n;i++){
      list.add(new ArrayList<Integer>());
    }
    for(int i=0;i<m;i++){
      int a = readI()-1,b=readI()-1;
      list.get(a).add(b); list.get(b).add(a);
    }
    ArrayList<Integer> stack = new ArrayList<Integer>();
    stack.add(0);
    boolean flg[]=new boolean[n];
    flg[0]=true;
    int before[]=new int[n];
    while(stack.size()>0){
      int now = stack.get(0); stack.remove(0);
      for(int i:list.get(now)){
        if(!flg[i]){
          before[i]=now;
          stack.add(i);
          flg[i]=true;
        }
      }
    }
    pl("Yes");
    for(int i=1;i<n;i++){
      pl((before[i]+1)+"");
    }

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
  public static String[] readSs(){
    return readL().split(" ");
  }
  public static int[] readIs(){
    return stoi(readSs());
  }
  public static int stoi(String s){
    return Integer.parseInt(s);
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
