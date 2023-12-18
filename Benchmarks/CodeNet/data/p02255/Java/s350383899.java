import java.util.Scanner;
public class Main {
	static void output(int[] num,int N){
		for(int j=0;j<N;j++){
			if(j==0) System.out.print(num[j]);
			else System.out.print(" "+num[j]);
		}
		System.out.println();
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int key,k;
		int[] num=new int[N];
		for(int i=0;i<N;i++) num[i]=scan.nextInt();
		
		for(int i=1;i<N;i++){
			output(num,N);
			key=num[i];
			k=i-1;
			while(k>=0&&num[k]>key){
				num[k+1]=num[k];
				k--;
			}
			num[k+1]=key;
		}
		output(num,N);
		scan.close();
	}
}