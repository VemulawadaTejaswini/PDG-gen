import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		String[] a = new String[n];
		for(int i=0;i<n;i++){
			a[i]=scan.next();
		}
		scan.close();
		for(int i=n-1;i>=1;i--){
			System.out.print(a[i]+" ");
		}
		System.out.println(a[0]);
	}

}