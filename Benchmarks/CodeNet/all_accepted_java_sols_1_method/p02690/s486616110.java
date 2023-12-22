
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for(long i = 1 ; i <= 1000; i++){
			for(long j = -1000; j < i; j++){
				if(Math.pow(i, 5) - Math.pow(j, 5) == x){
					System.out.println(i + " " +j);
					return;
				}
			}
		}
	}

}
