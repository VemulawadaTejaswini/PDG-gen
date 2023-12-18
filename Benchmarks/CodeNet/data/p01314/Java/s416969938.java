import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] a = new int[1000];
	int b = 0;
	int sum = 0;
	int ans = 0;
	for(int i=0;i<1000;i++){
		a[i] = sc.nextInt();
		for(int k=1;k<=a[i];k++){
			for(int m=k;m<=a[i];m++){
				sum = sum + m;
				if(sum==a[i]){
					ans = ans + 1;
				}
			}
			sum = 0;
		}
		System.out.println(ans-1);
		ans = 0;
		if(a[i]==0){
			break;
		}
	}
}
}