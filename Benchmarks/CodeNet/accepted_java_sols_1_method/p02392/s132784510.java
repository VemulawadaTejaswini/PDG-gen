import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		String str;
		//c???????????§??????
		if (a < c){
			if (b < c){
				if (a < b){
					str = "Yes";
				}else{str = "No";}
			}else{str = "No";}
		}else{str = "No";}
		
		System.out.println(str);
	}
}