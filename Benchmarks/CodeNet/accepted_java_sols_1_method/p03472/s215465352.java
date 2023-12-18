import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int h = sc.nextInt();

		int[] a = new int[n+1];
		int[] b = new int[n+1];
a[0]=0;
b[0]=0;
		for(int i = 1 ; i <= n ; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

int ata=0;

		Arrays.sort(a);
		Arrays.sort(b);
for(int i=n;i>=1;i--){
if(b[i]>a[n]){
	h=h-b[i];
ata++;
}
if(h<=0){
	break;
}
}


if(h<=0){
System.out.println(ata);
}else{
	if(h%a[n]==0){
System.out.println(ata+h/a[n]);}else{
	System.out.println(1+ata+h/a[n]);
}



}


	}}