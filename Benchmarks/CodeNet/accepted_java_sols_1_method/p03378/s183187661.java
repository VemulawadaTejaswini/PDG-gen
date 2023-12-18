import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int big = 0;
		int small = 0;
		for(int i = 0;i<M;i++){
			if(X>sc.nextInt()){
				small++;
			}else{
				big++;
			}
		}
		if(big>small){
			System.out.println(small);
		}else{
			System.out.println(big);
		}
	}

}
