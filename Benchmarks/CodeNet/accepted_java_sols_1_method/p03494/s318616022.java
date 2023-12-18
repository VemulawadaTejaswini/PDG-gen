import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		int count=0,flag;
		while(true) {
			flag=0;
			for(int i=0;i<n;i++) {
				if(array[i]%2==0) {
					array[i]/=2;
				}else {
					flag=1;
					break;
				}
			}
			if(flag==1) break;
			count++;
		}
		System.out.println(count);
	}
}
