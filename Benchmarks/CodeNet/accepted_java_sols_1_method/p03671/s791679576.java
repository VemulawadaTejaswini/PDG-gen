import java.util.*; 
public class Main{
 public static void main(String ...string){
  Scanner sc = new Scanner(System.in); 
   int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
   System.out.println(Math.min(a+b,Math.min(a+c,c+b))); 
 }
   
}
