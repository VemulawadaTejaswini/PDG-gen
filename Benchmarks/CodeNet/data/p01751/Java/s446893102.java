import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();
           
           if(c<=a) {
        	   System.out.println(c);
           }else {
        	   int x = 0;
        	   while(x<60) x += (a+b);
        	   if(x == 60) {
        	   System.out.println("-1");
        	   }else {
        		   while(x%60 > c) x += (a+b);
        		   System.out.println(x-(x%60)+c);
        	   }
           }         	   
        }
    }
}
