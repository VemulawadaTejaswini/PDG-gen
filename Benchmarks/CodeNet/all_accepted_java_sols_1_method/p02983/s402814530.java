import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		long l = input.nextInt();
        long r = input.nextInt();
        long remain = (long)(2 * Math.pow(10,9)) * 2;
        for (long i = l; i < r; i++) {
            for (long j = i + 1; j <= r; j++) {
                if(i*j %2019 < remain)
                    remain = i*j %2019;
                if(remain == 0)
                    break;
            }
            if(remain == 0)
                break;
        }
		System.out.println(remain);
	}
}