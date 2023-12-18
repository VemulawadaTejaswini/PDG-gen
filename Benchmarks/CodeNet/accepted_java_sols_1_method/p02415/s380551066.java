import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader mBufferedReader=new BufferedReader(new InputStreamReader(System.in));
    String str=mBufferedReader.readLine();
    char[] c=str.toCharArray();
    for(int i=0;i<c.length;i++){
      
      if(Character.isLowerCase(c[i])){
        System.out.print(Character.toUpperCase(c[i]));
      }else{
        System.out.print(Character.toLowerCase(c[i]));
      }
    }
    System.out.println();
   }
}
