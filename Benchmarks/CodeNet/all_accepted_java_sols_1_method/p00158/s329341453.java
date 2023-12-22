import java.util.Scanner;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int n;
		int cun = 0;
		
		while(scan.hasNext()){
			n = scan.nextInt();
			if(n == 0){
				break;
			}
			while(n != 1){
				if(n % 2 == 0){
					n = n/2;
					++cun;
				}else{
					n = n*3 + 1;
					++cun;
				}
			}
			System.out.println(cun);
			cun = 0;
		}
	}
}