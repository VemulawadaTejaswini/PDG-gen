import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<=n-1;i++){
		a[i]=sc.nextInt();
	}
Arrays.sort(a);
int sam=0;
for(int i=0;i<=n-2;i++){
if(a[i]==a[i+1]){
	sam++;
}
}System.out.println(n-sam);
	}}