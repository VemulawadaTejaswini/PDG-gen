import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int p = scan.nextInt();
			for(int i = 0;i < 2;i++){
				int t = scan.nextInt();
				if(t < p){
					p = t;
				}
			}
			int j = scan.nextInt();
			int jj = scan.nextInt();
			System.out.println(p+((j < jj)?j:jj)-50);
		}
	}
}