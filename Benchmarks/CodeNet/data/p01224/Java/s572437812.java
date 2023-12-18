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
			}else if(n == 1){
				System.out.println("deficient number");
				continue;
			}
			int s = 1;
			int a = 1;
			for(int i = 2;i < a && s <= n;i++){
				if(n%i == 0){
					a = n / i;
					s += (i == a)?i:(i + a);
				}
			}
			if(n == s){
				System.out.println("perfect number");
			}else if(n > s){
				System.out.println("deficient number");
			}else{
				System.out.println("abundand number");
			}
		}
	}
}