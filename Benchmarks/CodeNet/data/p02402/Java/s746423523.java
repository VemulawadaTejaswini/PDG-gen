import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int request=sc.nextInt();
		long sum=0;
		int[] ary=new int[request];
		for(int i=0;i<request;i++){
			ary[i]=sc.nextInt();
			sum+=(long)ary[i];
		}
		//配列aryを昇順にソートして、最初と最後の数字をとる
		Arrays.sort(ary);
		//System.out.println(sum);
		System.out.println(ary[0]+" "+ary[request-1]+" "+sum);
	}

}

