import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		//int N = stdIn.nextInt();
		int N;
		while((N=stdIn.nextInt()) != 0){
			int a=0;
			int count=0;
			for(int i=1;i<N;i++){
				for(int j=i;a<N;j++){
					a += j;
					if(a==N){
						count++;
						break;
					}
					else if(a>N){
						break;
					}
				} 
				a=0;
			}
			System.out.println(count);
		}
	}
}