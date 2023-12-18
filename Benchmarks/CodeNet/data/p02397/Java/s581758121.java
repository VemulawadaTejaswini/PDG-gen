import java.util.Scanner;


class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x , y;
		int a = 0;
		while(a==0){
			x = scan.nextInt();
			y = scan.nextInt();
			if(x == 0 && y == 0){
				 a=1;
				 break;
			}else if(x > y){
					System.out.println(y + " " + x);
				}else{
					System.out.println(x + " " + y);
			}
		}
	}
}
