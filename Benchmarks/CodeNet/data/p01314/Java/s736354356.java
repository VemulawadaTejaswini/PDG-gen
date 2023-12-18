import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int a=0;
		int count=0;
		for(int i=1;i<N;i++){
			for(int j=i;a<N;j++){
				a += j;
				if(a==N) count++;
			} 
			a=0;
		}
		if(count!=0) System.out.println(count);
	}
}