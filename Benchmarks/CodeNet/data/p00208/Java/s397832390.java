import java.util.Scanner;

public class Main {

	static boolean flag;
	static int a;
	
	static boolean YonRoku(){
		if(a==0){
			return flag;
		}
		else if(a%10==4||a%10==6){
			flag = true;
		}
		a/=10;
		YonRoku();
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int od = 1;
			int nw = 1;
			for(;od<=n;od++){
//				System.out.println(od+" "+nw);
				while(true){
					flag = false;
					a = nw;
//					System.out.println("call "+nw);
					nw++;
					if(YonRoku()){
//						System.out.println("*");
					}
					else{
						break;
					}
				}
			}
			System.out.println(nw-1);
		}
	}
}