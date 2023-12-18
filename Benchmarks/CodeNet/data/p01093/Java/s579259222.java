import java.util.Scanner;
import java.util.Arrays;
public class Main {
	//static int n,k,u[],min,max;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int data[]=new int[n];
		for(int i=0;i<n;i++){
			data[i]=sc.nextInt();
		}
		Arrays.sort(data);
		int min=data[0]-data[1];
		if(min<0){
			min=min*-1;
		}
		for(int i=1;i<n;i++){
			int hoge=data[i-1]-data[i];
			if(hoge<0){
				hoge=hoge*-1;
			}
			if(min>hoge){
				min=hoge;
			}
		}
		System.out.println(min);
	}
}