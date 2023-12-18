import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[]=new int[3];
		for(int i=0;i<3;i++){
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=1;i<3;i++){
			max=Math.max(a[i],max);
		}
		System.out.println(a[0]*a[1]*a[2]/max/2);








	}
}
