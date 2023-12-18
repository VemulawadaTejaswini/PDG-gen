import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    int n=readI();
    int bitc=0;
    char ch[]=new char[n];
    for(int i=0;i<n;i++){
      ch[i] = readC();
      if(ch[i]=='1'){bitc++;}
    }
    if(bitc==0){
      for(int i=0;i<n;i++){
        pl("1");
      }
      System.exit(0);
    }
    int sump=0,summ=0;
    int k[][]=new int[2][n];
    k[0][0]=1;k[1][0]=1;
    if(bitc==1||bitc==2){k[1][0]=0;}
    if(ch[n-1]=='1'){
      sump=1;summ=k[1][0];
    }
    for(int i=1;i<n;i++){
      k[0][i]=(k[0][i-1]*2)%(bitc+1);
      if(bitc>1){
        k[1][i]=(k[1][i-1]*2)%(bitc-1);
      }
      if(ch[n-1-i]=='1'){
        sump=(sump+k[0][i])%(bitc+1);summ=(summ+k[1][i])%(bitc-1);
      }
    }
    for(int i=0;i<n;i++){
      int j=1;
      if(ch[i]=='1'){
        if(bitc==1){pl("0");}
        else{
          int x=summ-k[1][n-1-i];
          if(x<0){x+=(bitc-1);}
          for(j=1;x!=0;j++){
            x=x%Integer.bitCount(x);
          }
          pl(j+"");
        }
      }else{
        int x=sump+k[0][n-1-i];
        if(x>bitc){x=x%(bitc+1);}
        for(j=1;x!=0;j++){
          x=x%Integer.bitCount(x);
        }
        pl(j+"");
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
