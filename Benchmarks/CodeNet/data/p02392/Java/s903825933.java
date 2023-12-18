import java.io.*;

class Sample
{
 public static void main(String args[]){;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int a = Integer.parseInt(br.readLine);
  int b = Integer.parseInt(br.readLine);
  int c = Integer.parseInt(br.readLine);
  
  if(a<b && b<c){
    System.out.println("Yes");
  }else{
    System.out.println("No");
  }
}