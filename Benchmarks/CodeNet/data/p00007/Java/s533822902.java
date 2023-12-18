import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int x = scan.nextInt();
			int n = 100000;
			for(int i = 0;i < x;i++){
				n = n + (int)(n*0.05);
			}
			n = n - (n % 10000) +  10000;
			System.out.println(n);
		}
	}
}