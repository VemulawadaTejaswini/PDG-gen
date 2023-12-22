import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a[] = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
Arrays.sort(a);
int ans=0;

ans+=a[2]-a[1];
a[0]+=a[2]-a[1];
ans+=(a[2]-a[0])/2;
if((a[2]-a[0])%2==1){
ans+=2;
}
System.out.println(ans);
	}
}