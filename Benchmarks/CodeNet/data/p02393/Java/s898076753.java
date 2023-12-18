import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 public static void print(int a,int b,int c){
	 System.out.print(a);
	 System.out.print(" ");
	 System.out.print(b);
	 System.out.print(" ");
	 System.out.println(c);
 }
    public static void main(String[] args) throws IOException {
             
       Scanner sc = new Scanner(System.in);
       int []a=new int[3];
      a[0] = sc.nextInt();
      a[1] = sc.nextInt();
      a[2] = sc.nextInt();
      
      Arrays.sort(a);
      print(a[0],a[1],a[2]);       }
     
      } 
   