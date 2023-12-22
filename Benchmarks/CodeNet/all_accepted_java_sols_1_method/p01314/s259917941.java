import java.util.Scanner;

public class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] a = new int[1000];
	int sum = 0;
	int ans = 0;
	for(int i=0;i<1000;i++){
		a[i] = sc.nextInt();
		for(int k=1;k<=a[i]/2;k++){
			for(int m=k;m<=a[i];m++){
				sum = sum + m;
				if(sum==a[i]){
					ans = ans + 1;
				}
				if(sum>a[i]){
					break;
				}
			}
			sum = 0;
		}
		if(a[i]==0){
			break;
		}
		System.out.println(ans);
		ans = 0;
	}
}
}