import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int hiki = sc.nextInt();
		int asi = sc.nextInt();
		boolean flg = false;
		for(int i = 0; i <= hiki; i++){
			if((2 * i) + (4 * (hiki - i)) == asi){
				flg = true;
			}
		}
		if(flg){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}