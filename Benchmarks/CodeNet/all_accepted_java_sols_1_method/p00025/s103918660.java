import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int[] a = new int[10];
			int[] b = new int[10];
			
			for(int n = 1; n < 16 ; n <<= 1){
				a[sc.nextInt()] = n;
			}
			for(int n = 1; n < 16 ; n <<= 1){
				b[sc.nextInt()] = n;
			}
			
			int counthits = 0; int countblows = 0;
			
			for(int i = 0; i < a.length; i++){
				if ((a[i] & b[i]) != 0){
					counthits++;
				}else if ((a[i] * b[i] != 0)){
					countblows++;
				}
			}
			System.out.println(counthits + " " + countblows);
		}
		sc.close();
	}
}