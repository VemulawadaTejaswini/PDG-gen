import java.util.Scanner;
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int i, j, k;
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		
		bubblesort(n, a);
	}
	public static void bubblesort(int n, int a[]){
		int flag = 1;
		int i = 0;
		int temp;
		int count = 0;
		while(flag == 1){
			flag = 0;
			for(int j = n - 1; j >= i + 1; j--){
				if(a[j] < a[j - 1]){
					temp = a[j];
					a[j] = a[j-1];
					a[j - 1] = temp;
					count++;
					flag = 1;
				}
			}
			i++;
		}
		for(i = 0; i < n; i++){
			if(i == n - 1) System.out.println(a[i]);
			else System.out.print(a[i] + " ");
		}
		System.out.println(count);
	}

}
