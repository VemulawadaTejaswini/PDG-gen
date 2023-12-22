import java.util.*;
public class Main {
	public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }    
      }
}