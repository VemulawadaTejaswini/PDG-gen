import java.util.Scanner;
import java.util.Arrays;
public class Main {
	
	public static int binarySearch(int[] array, int key) {
		int pLeft = 0;
		int pRight = array.length - 1;

		do {
			int center = (pLeft + pRight) / 2;

			if (array[center] == key) {
				return 1;
			} else if (array[center] < key){
				pLeft = center + 1;
			} else {
				pRight = center - 1;
			}
		} while (pLeft <= pRight);

		return -1;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int S,T,m,count;
		count=0;
		S=sc.nextInt();
		int ss[]=new int[S];
		for(int i=0;i<S;i++){
			ss[i]=sc.nextInt();
		}
		T=sc.nextInt();
		int tt[]=new int[T];
		for(int i=0;i<T;i++){
			tt[i]=sc.nextInt();
		}
		
		Arrays.sort(ss);
		Arrays.sort(tt);
		m=Math.min(ss.length,tt.length);
		if(ss.length>tt.length){
			for(int i=0;i<m;i++){
				if(binarySearch(ss,tt[i])==1){
					count++;
				}
			}
		}else{
			for(int i=0;i<m;i++){
				if(binarySearch(tt,ss[i])==1){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}