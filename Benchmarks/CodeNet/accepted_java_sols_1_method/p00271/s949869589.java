import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[14];
		for(int i = 0; i < 14; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < 13; i += 2)
		System.out.println(a[i] - a[i+1]);
	}
}