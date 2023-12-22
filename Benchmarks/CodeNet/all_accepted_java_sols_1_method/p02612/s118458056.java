import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = a / 1000;
    int ans;
    if (a == b * 1000){
    	ans = b * 1000 - a; 
    } else {
    	ans = (b + 1) * 1000 - a; 
    }
    System.out.println(ans);  
      
    }

}