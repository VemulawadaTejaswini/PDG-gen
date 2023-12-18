import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = 100000;
		while(scan.hasNext()){
			int x = scan.nextInt();
			int m = n;
			for(int i = 0;i < x;i++){
				m = m + (int)(m*0.05);
			}
			int t = m % 10000;
			if(t != 0){
				m = m - t + 10000;
			}
			System.out.println(m);
		}
	}
}