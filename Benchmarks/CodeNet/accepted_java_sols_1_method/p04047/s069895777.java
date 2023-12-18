import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[2*N];
		int index=0;
		while(index<2*N){
			arr[index++]=sc.nextInt();
		}
		Arrays.sort(arr);
		int res=0;
		for(int i=0;i<2*N;i +=2){
			res +=arr[i];
		}
		System.out.println(res);
	}
}