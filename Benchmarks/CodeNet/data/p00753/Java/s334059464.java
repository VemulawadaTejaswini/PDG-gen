
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		while(true){
			int n=0,p=0;
			n = scan.nextInt();
			for(int i = n;i < n*2;i++){
				if(i%2!=0){
					p++;
				}
			}
			System.out.println(p);
		}
	}
}

