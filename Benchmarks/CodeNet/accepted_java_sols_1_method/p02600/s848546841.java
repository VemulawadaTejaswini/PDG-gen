import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int rate;
		if(x <=599){
			rate = 8;
		}else if(x <= 799){
			rate = 7;
		}else if(x <= 999){
			rate = 6;
		}else if(x <= 1199){
			rate = 5;
		}else if(x <= 1399){
			rate = 4;
		}else if(x <= 1599){
			rate = 3;
		}else if(x <= 1799){
			rate = 2;
		}else{
			rate = 1;
		}
		System.out.println(rate);
	}
}