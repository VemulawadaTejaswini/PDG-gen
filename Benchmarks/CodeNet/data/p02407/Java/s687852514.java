import java.util.Scanner;
class Main {
	int n,i;
	int[] a = new int[100];
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i = 0;i < n;i++){
			a[i] = sc.nextInt();
		}
		for(i = (n - 1);i > 0;i--){
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println(a[0]);
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}