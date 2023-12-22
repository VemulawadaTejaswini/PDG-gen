import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt(),sum=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if(sum%(4*m)!=0&&sum/(4*m)<a[i])count++;
			else if(sum%(4*m)==0&&sum/(4*m)<=a[i])count++;
		}
		System.out.println(count>=m?"Yes":"No");
		sc.close();
	}
}
