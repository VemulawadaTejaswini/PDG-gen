import java.util.Scanner;
class Procon{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = 100000;
		while(scan.hasNext()){
			int x = scan.nextInt();
			int m = n;
			int s = n;
			for(int i = 0;i < x;i++){
				m = m + (int)(n*0.05);
				s = s + (int)(s*0.05);
			}
			int t = m % 10000;
			int t2 = s % 10000;
			if(t != 0){
				m = m - t + 10000;
			}
			if(t2 != 0){
				s = s - t2 +10000;
			}
			System.out.println(s);
		}
	}
}