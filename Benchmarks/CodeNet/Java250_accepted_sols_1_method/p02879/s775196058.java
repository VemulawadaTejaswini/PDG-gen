import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(0<A&&0<B&&A<10&&B<10){
            System.out.println(A*B);
            return;
        }
		System.out.println("-1");
	}
}