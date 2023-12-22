import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int d = scan.nextInt();
			int sum = 0;
			for(int i = 1;i <= (600/d);i++){
				sum += (i-1)*(i-1)*d*d*d;
			}
			System.out.println(sum);
		}
	}
}