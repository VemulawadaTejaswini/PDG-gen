import java.util.*;
import java.io.*;

class Main{
  public static void main(String args[]){
    int n=readI(),q=readI();
    int countA[][]=new int[n][n];
    int x=readI();countA[0][x-1]=1;
    for(int i=1;i<n;i++){
      x=readI();
      countA[i][x-1]=1;
      for(int j=0;j<n;j++){
        countA[i][j]+=countA[i-1][j];
      }
    }
    for(int i=0;i<q;i++){
      int l=readI()-1,r=readI()-1;
      int c=0;
      if(r-l==0){
        pl("1");
      }else if(l==0){
        for(int j=0;j<n;j++){
          if(countA[r][j]>0){
            c++;
          }
        }
        pl(c+"");
      }else{
        for(int j=0;j<n;j++){
          if(countA[r][j]-countA[l-1][j]>0){
            c++;
          }
        }
        pl(c+"");
      }
    }
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
  public static int readI(){
    return stoi(readS());
  }
  public static long readLong(){
    return stol(readS());
  }
  public static long stol(String s){
    return Long.parseLong(s);
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
