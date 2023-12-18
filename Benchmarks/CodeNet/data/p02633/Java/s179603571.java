import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
		for (int i=1;i<=360;i++) {
			if ((i*x)%360==0) {
				System.out.println(i);
              return;
			}
		}
	}
}