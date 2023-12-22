import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int[] a={sc.nextInt(),sc.nextInt(),sc.nextInt()};
			if(a[0]==0&&a[1]==0&&a[2]==0){
				break;
			}
			Arrays.sort(a);
			double d=Math.hypot(a[0],a[1])/2;
			int n=sc.nextInt();
			for(int i=0;i<n;i++){
				 System.out.println(sc.nextInt()>d?"OK":"NA");
			}
		}
	}
}