import java.util.*;
public class Main {
 
         
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            	int a =Math.min(scan.nextInt(), scan.nextInt());
            	a = Math.min(scan.nextInt(), a);
            	int b =Math.min(scan.nextInt(),scan.nextInt());
            	System.out.println(a+b-50);
        }
}