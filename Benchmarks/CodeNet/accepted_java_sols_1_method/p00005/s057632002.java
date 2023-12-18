import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		long a,b,z,A,B;
		while(scan.hasNext()){
			a = scan.nextInt();
			b = scan.nextInt();
			z = 1;
			A = a;
			B = b;
			while(z != 0){
				z = a % b;
				a = b;
				b = z;
			}
			for(int i = 1 ; i > 0 ; i++){
				if(A*B == a*i){
					System.out.println(a + " " + i);
					break;
				}
			}
		}
	}
}