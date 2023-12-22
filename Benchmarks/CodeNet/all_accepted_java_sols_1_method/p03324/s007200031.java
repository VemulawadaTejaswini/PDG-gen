
     import java.io.*;
public class Main{
  public static void main(String[] args){
    int D=1;
    int N=1;
    String buf1,buf2,buf3;
    try{
      BufferedReader br
          = new BufferedReader(new InputStreamReader(System.in));

      buf1 = br.readLine();
      buf2 = buf1.substring(0,buf1.indexOf(" "));
      buf3 = buf1.substring(buf1.indexOf(" ")+1);
      D= Integer.parseInt(buf2);
      N = Integer.parseInt(buf3);

  } catch(Exception e) {
      System.out.print("Error:" + e);
  }
    if(N<=100){
    if(D==0){
     if(N==100){System.out.println(N+1);}
     else{System.out.println(N);}}
     if(D==1){
       if(N==100){System.out.println(N*101);}
     else{System.out.println(N*100);}}
    if(D==2){
       if(N==100){System.out.println(N*10100);}
     else{System.out.println(N*10000);}}
    }


  }
}