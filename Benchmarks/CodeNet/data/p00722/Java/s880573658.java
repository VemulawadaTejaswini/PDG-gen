import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int n = stdIn.nextInt();
			if(a==0 && b==0 && n==0) break;
			int count = 0;
			int check = 0;
			for(int i=0;;i++){
				for(int j=2;j<(a+i*b);j++){
					if((a+i*b)%j == 0){
						check = 1;
						break;
					}
				}
				if(check == 0) count++;
				if(count == n){
					System.out.println((a+i*b));
					break;
				}
				check=0;
			}
		}
	}
}