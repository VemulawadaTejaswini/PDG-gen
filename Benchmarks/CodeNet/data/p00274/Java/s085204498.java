import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int hoz = 1;
		int hoz2 = 0;
		while(a != 0){
			for(int cnt = 0;cnt < a;cnt++){
				int b = sc.nextInt();
				if(b >= 2){
					hoz++;
				}else if(b == 1){
					hoz2++;
				}
			}
			if(hoz >= 2){
				System.out.println(hoz + hoz2);
			}else{
				System.out.println("NA");
			}
			hoz = 1;
			hoz = 0;
			a = sc.nextInt();
		}
	}
}