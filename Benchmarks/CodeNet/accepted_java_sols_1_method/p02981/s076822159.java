import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int t1 = sc.nextInt();
      	int t2 = sc.nextInt();
      
      	if (n*t1 >= t2) {
          System.out.println(t2);
        } else {
          System.out.println(n*t1);
        }
		
		sc.close();
	}
 
}