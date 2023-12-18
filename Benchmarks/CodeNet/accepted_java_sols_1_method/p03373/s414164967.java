import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pizzaA = sc.nextInt();
        int pizzaB = sc.nextInt();
        int pizzaH = sc.nextInt();
        
        int Aneed = sc.nextInt();
        int Bneed = sc.nextInt();
        
        int ans = Integer.MAX_VALUE;
        for(int h=0;h<=Math.max(Aneed,Bneed);h++){
        	//2*h: the num of h&h pizza
        	int a = Math.max(0,Aneed-h);
        	int b = Math.max(0,Bneed-h);
        	
        	ans = Math.min(ans, pizzaA*a+pizzaB*b+pizzaH*2*h);
        }
        System.out.println(ans);
    }
}