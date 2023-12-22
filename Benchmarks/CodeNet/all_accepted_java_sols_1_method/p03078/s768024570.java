import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k = sc.nextInt();
		long[] x1 = new long[x];
		long[] y1 = new long[y];
		long[] z1 = new long[z];
		for(int i = 0; i<x; i++){
			x1[i]=sc.nextLong();
		}
		for(int i = 0; i<y; i++){
			y1[i]=sc.nextLong();
		}
		for(int i = 0; i<z; i++){
			z1[i]=sc.nextLong();
		}
		long[] ab=new long[x*y];
		int index=0;
		for(int i = 0; i<x; i++){
			for(int j = 0; j<y; j++){
				ab[index++]=x1[i]+y1[j];
			}
		}
		Arrays.sort(ab);
		index=0;
		long[] abc = new long[Math.min(x*y,3000)*z];
		for(int i = 0; i<Math.min(x*y,3000); i++){
			for(int j = 0; j<z; j++){
				abc[index++]=ab[x*y-1-i]+z1[j];
			}
		}
		Arrays.sort(abc);
		for(int i = 0; i<k; i++){
			System.out.println(abc[abc.length-1-i]);
		}
	}
}
