import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			int m=sc.nextInt();
			if(n==0&&m==0) break;
			Integer[] data = new Integer[n];
			for(int i=0;i<n;++i){
				data[i]=sc.nextInt();
			}
			int max=-1;
			for(int i=0;i<n-1;++i){
				for(int j=i+1;j<n;++j){
					if(max<data[i]+data[j]&&data[i]+data[j]<=m) max=data[i]+data[j];
				}
			}
			if(max==-1) System.out.println("NONE");
			else System.out.println(max);
		}
	}
}
