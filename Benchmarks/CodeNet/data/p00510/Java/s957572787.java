import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			int max = m;
			for(int i = 0;i < n;i++){
				int in = scan.nextInt();
				int out = scan.nextInt();
				if(m < 0){
					break;
				}
				m += in - out;
				if(max < m){
					max = m;
				}
			}
			System.out.println((m < 0)?0:max);
		}
	}
}