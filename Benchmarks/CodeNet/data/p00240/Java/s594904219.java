import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int y = scan.nextInt();
			int bank = 0;
			double max = 0;
			int a;
			int r;
			int t;
			double sum = 0;
			for(int i = 0;i < n;i++){
				a = scan.nextInt();
				r = scan.nextInt();
				t = scan.nextInt();
				if(t == 1){
					sum = 1.0 + 0.01 * (double)(y * r);
				}else if(t == 2){
					sum = Math.pow(1.0+(0.01*(double)r),y);
				}
				if(sum > max){
					max = sum;
					bank = a;
				}
			}
			System.out.println(bank);
		}
	}
}