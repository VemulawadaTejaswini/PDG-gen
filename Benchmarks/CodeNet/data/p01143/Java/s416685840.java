import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			int p = scan.nextInt();
			if(n == 0 && m == 0 && p == 0){
				break;
			}
			int sum = 0;
			int a = 0;
			m--;
			int t;
			for(int i = 0;i < n;i++){
				sum += t = scan.nextInt();
				if(i == m){
					a = t;
				}
			}
			System.out.println((a==0)?0:sum*(100-p)/a);
		}
	}
}