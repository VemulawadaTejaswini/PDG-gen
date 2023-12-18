import java.util.Scanner;
import java.util.Arrays;
public class Main {
	//static int n,k,u[],min[count],max;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min[]=new int[50000];
		int count=-1;
		while(true){
			count++;
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			int data[]=new int[n];
			for(int i=0;i<n;i++){
				data[i]=sc.nextInt();
			}
			Arrays.sort(data);
			min[count]=data[0]-data[1];
			if(min[count]<0){
				min[count]=min[count]*-1;
			}
			for(int i=1;i<n;i++){
				int hoge=data[i-1]-data[i];
				if(hoge<0){
					hoge=hoge*-1;
				}
				if(min[count]>hoge){
					min[count]=hoge;
				}
			}
		}
		for(int i=0;i<count;i++){
			System.out.println(min[i]);
		}
		
	}
}