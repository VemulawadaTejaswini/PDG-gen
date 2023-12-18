import java.util.*;
public class Main {

	public static void main(String[] args) {
		int n,max,min;
		long sum;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		sum=max=min=scan.nextInt();
		for(int i=2;i<=n;i++){
			int temp = scan.nextInt();
			sum += temp;
			if(max<temp)
				max=temp;
			if(min>temp){
				min=temp;
			}
		}
		System.out.println(min + " " + max + " " + sum);
	}
}

