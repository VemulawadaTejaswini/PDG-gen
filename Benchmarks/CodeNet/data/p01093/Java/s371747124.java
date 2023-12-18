import java.util.*;
public class icpc2016_1_Main {
	
	public static void Main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int min=1000001;
		int data[] = new int [n]
		for(int i=0;i<n;++i){
			data[i]=scan.nextInt();
		}
		Arrays.sort(data);
		cul(data,n-1,min);
		System.out.println(min);
	}
	
	public static int cul(int[]data,int n,int min){
		for(int i=n;i>0;--i){
			int num=data[i]-data[i-1];
			if(min>num){
				min=num;
			}
		}
		return min;
	}
}