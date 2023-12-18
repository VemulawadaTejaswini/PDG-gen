import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int z = 1;
		int A;
		int B;
		while(scan.hasNext()){
			a = scan.nextInt();
			b = scan.nextInt();
			A = a;
			B = b;
			for(int e = 1;e > 0;e++){
				z = A % B;
				if(z == 0){
					System.out.print(B + " ");
					break;
				}else{
					A = B;
					B = z;
				}
			}
			for(int c = 1;c*a <= 2000000000;c++){
				int d;
				for(d = 1;d*b <= 2000000000;d++){
					if(a*c == b*d){
						System.out.println(a*c);
						break;
					}
				}
				if(a*c == b*d){
					break;
				}
			}
		}
	}
}