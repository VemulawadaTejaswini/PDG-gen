import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int t = scan.nextInt();
			if(t == 0){
				break;
			}
			int n = scan.nextInt();
			int r = 0;
			for(int i = 0;i < n;i++){
				r += - (scan.nextInt() - scan.nextInt());
			}
			if(t <= r){
				System.out.println("OK");
			}else{
				System.out.println(t - r);
			}
		}
	}
}