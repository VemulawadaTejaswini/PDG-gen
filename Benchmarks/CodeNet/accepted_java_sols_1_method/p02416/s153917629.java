import java.io.*;

public class Main{
  public static void main(String[] args){
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    try{
      String line;
      while((line=reader.readLine())!=null){
        if(line.equals("0")) break;
        int sum=0;
        char[] x=line.toCharArray();
        for(char a:x) sum+=a-'0';
        System.out.println(sum);
      }
    }catch(IOException e){
      System.out.println(e);
    }
  }
}

