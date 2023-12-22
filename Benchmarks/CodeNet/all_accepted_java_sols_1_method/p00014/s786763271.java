import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		while(sc.hasNext()){
			n=sc.nextInt();
			for(int i = 0 ; i < 600/n-1 ; i ++){
				sum += ((i+1)*n)*((i+1)*n)*n;
			}
			System.out.println(sum);
			sum=0;
		}
	}
}