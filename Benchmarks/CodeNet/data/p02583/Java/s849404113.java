import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    int n=readI(),count=0;
    int ar[]=new int[n];
    for(int i=0;i<n;i++){
      ar[i]=readI();
    }
    sortA(ar);
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(ar[i]==ar[j]){continue;}
        for(int k=j+1;k<n;k++){
          if(ar[j]==ar[k]){continue;}
          if(ar[i]+ar[j]>ar[k]){
            count++;
          }
        }
      }
    }
    pl(count+"");
  }

  public static void sortA(int n[]){
    Arrays.sort(n);
  }

  static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
  public static String read(){
    try{
      return ctos((char)br.read());
    }catch(IOException e){
      e.printStackTrace();
      return "";
    }
  }
  public static char readC(){
    try{
      return (char)br.read();
    }catch(IOException e){
      e.printStackTrace();
      return (char)-1;
    }
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
  public static long readLong(){
    return stol(readS());
  }
  public static long stol(String s){
    return Long.parseLong(s);
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
  public static int[] Itoi(Integer a[]){
    int[]result=new int[a.length];
    for(int i=0;i<a.length;i++){
      result[i]=a[i];
    }
    return result;
  }
}
