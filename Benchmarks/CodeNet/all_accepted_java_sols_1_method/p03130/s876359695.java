import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= new int[7];
		int i,as=0;
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();
		a[3]=sc.nextInt();
		a[4]=sc.nextInt();
		a[5]=sc.nextInt();
		as=a[0]+a[1]+a[2]+a[3]+a[4]+a[5];
		
		if(as==15) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}	
	}
}
