import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     for(int i=1; i<=3; i++)
     if(a*b*i%2 != 0) {
    	 System.out.println("Yes");
    	 break;
     } else {
    	 System.out.println("No");
    	 break;
     }     
      
    	  
      
    }
 }
