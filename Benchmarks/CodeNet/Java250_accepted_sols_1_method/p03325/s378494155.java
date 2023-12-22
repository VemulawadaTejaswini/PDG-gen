import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int N = sc.nextInt();
		for(int i = 0; i < N; i++){
			int a = sc.nextInt();
			if(a%2 == 0){
				while(a%2 == 0){
					a /= 2;
					count++;
				}
			}else{
				
			}
		}
			System.out.println(count);
	}
}