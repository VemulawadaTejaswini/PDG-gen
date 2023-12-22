import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	int L[]=new int[N];
	int sum=0;
	int max=0;
	for(int i=0;i<N;i++) {
		L[i]=sc.nextInt();
		sum+=L[i];
		if(max<L[i]) {
			max=L[i];
		}
	}
	if(max>=(sum-max)) {
		System.out.println("No");
	}else {
		System.out.println("Yes");
	}

}
}
