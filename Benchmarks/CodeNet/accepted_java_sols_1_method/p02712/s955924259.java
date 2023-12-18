import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextInt();
		scn.close();
		long sum = 0;
		for(long i = N;i>0;i--) {
			if(i%3 == 0) {
			}else if(i%5 == 0){
			}else {
			sum =sum+i;
			}
		}
		System.out.println(sum);
	}

}
