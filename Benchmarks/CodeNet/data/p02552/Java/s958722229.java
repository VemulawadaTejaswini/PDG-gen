import java.util.*;

public class main {
	public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        if (x == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        } 
      }
}