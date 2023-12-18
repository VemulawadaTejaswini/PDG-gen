import java.io.*;

public class Main{
  public static void main(String[] args){
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    try{
      int count=0;
      String line;
      while((line=br.readLine())!=null){
          count=0;
          String[] input=line.split(" ");
          int n=Integer.parseInt(input[0]);
          int x=Integer.parseInt(input[1]);
          if(n==0 && x==0) break;
          for(int i=1;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
              for(int k=j+1;k<=n;k++){
                if(i+j+k==x) count++;
              }
            }
          }
          System.out.println(count);
      }
    }catch(IOException e){
      System.out.println(e);
    }
  }
}

