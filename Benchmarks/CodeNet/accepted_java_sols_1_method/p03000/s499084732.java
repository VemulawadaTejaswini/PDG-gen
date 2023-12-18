
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] array=new int[N];
		for(int i=0;i<N;i++){
			array[i]=sc.nextInt();
		}
		
		int count=1;
		int[] D=new int[N+1];
		D[0]=0;
		
		for(int j=1;j<=N;j++){
			D[j]=D[j-1]+array[j-1];
			if(D[j]<=X)count++;
			else break;
		}
		
		System.out.println(count);
		
	}

}
