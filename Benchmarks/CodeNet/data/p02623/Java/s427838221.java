import java.util.*;
import java.io.*;
import java.math.BigDecimal;
class Main{
  public static void main(String args[]){
    int n=readI(),m=readI();
    int k=readI();
    long time=0;
    int a[]=new int[n],b[]=new int[m];
    int count=0,sinn=n,sinm=m;
    boolean flg=true;
    for(int i=0;i<n;i++){
      if(flg){
        a[i]=readI();
        time+=a[i];
        if(time>k){
          flg=false;sinn=i;
        }
      }else{
        readI();
      }
    }
    flg=true;time=0;
    for(int i=0;i<m;i++){
      if(flg){
        b[i]=readI();
        time+=b[i];
        if(time>k){
          flg=false;sinm=i;
        }
      }else{
        readI();
      }
    }
    n=sinn;m=sinm;
    int ai=0,bi=0;
    while(ai<n||bi<m){
      if(ai==n){
        if(k<b[bi]){
          break;
        }else{
          k-=b[bi];bi++;
          count++;
        }
      }else if(bi==m){
        if(k<a[ai]){
          break;
        }else{
          k-=a[ai];ai++;
          count++;
        }
      }else{
        if(a[ai]<b[bi]){
          if(k<a[ai]){
            break;
          }else{
            k-=a[ai];ai++;
            count++;
          }
        }else{
          if(k<b[bi]){
            break;
          }else{
            k-=b[bi];bi++;
            count++;
          }
        }
      }
    }
    pl(count+"");
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
