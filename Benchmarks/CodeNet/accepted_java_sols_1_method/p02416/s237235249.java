import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader mBufferedReader=new BufferedReader(new InputStreamReader(System.in));
    String str;
    while((str=mBufferedReader.readLine())!=null){
      if(str.equals("0")){
        break;
      }
      int sum=0;
      for(int i=0;i<str.length();i++){
        sum+=str.charAt(i)-'0';
      }
      System.out.println(sum);
    }
    mBufferedReader.close();
  }
}
