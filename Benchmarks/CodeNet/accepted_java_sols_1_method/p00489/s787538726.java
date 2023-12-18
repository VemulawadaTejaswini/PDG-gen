import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int b,c,d,e,f;
		int j=in.nextInt();
		int[] a = new int[j+1];
		int sum = 0;
		for(int i = 0;i < j;i++){
			sum = sum + i;
		}
		for(int i = 0;i <= j;i++){
			a[i] = 0;
		}
		for(int i = 0;i < sum;i++){
			b=in.nextInt();
			c=in.nextInt();
			d=in.nextInt();
			e=in.nextInt();
			if(d < e)a[c]+=3;
			else if(d > e) a[b]+=3;
			else {
				a[b]++;
				a[c]++;
			}
		}
		for(int i = 1;i <= j;i++){
			f = 1;
			for(int s = 1;s <= j;s++){
				if(a[i] < a[s]){
					f++;
				}
			}
			System.out.println(f);
		}
	}
}