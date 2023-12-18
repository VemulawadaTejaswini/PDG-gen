import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = 100000;
		while(scan.hasNext()){
			int x = scan.nextInt();
			int m = n;
			for(int i = 0;i < x;i++){
				m = m + (int)(n*0.05);
			}
			m = m - (m % 10000) +  10000;
			System.out.println(m);
		}
	}
}