import java.util.Arrays;
import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float ans=0;
	int N=sc.nextInt();
	int v[]=new int[N];
	for(int i=0;i<v.length;i++) {
		v[i]=sc.nextInt();
	}
	Arrays.sort(v);
	ans=v[0];
	for(int i=1;i<N;i++) {
		ans=(ans+v[i])/2;
	}
	System.out.println(ans);
}
}
