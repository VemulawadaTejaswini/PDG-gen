import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
class Main{
  public static void main(String args[]) throws IOException{
     int a,b;
      Scanner a= new Scanner(System.in);
      Scanner b = new Scanner(System.in);
     if(a>b)
            System.out.println("a>b");
     if(a<b)
            System.out.println("a<b");
     else
            System.out.println("a=b");
  }
}