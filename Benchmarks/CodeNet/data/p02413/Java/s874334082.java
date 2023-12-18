import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int addr = 0;
		int addc = 0;
		int num;
		int total = 0;
		int[] a= new int[c];
		for(int i=0; i<r; i++){
			addr=0;
			for(int j=0; j<c; j++){
				num = sc.nextInt();
				System.out.print(num + " ");
				addr += num;
				a[j] += num;
				total += num;
			}
			System.out.println(addr);
		}
		for(int j=0; j<c; j++){
			System.out.println(a[j] + " ");
		}
		System.out.println(total);
	}
}