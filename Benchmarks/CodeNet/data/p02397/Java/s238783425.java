import java.util.Scanner;
	class Main{
	public void Germany() {
		Scanner sc = new Scanner(System.in);
		int x,y,z;
		x = sc.nextInt();
		y = sc.nextInt();
		while(x != 0 || y != 0){
			if(x > y){
				z = x;
				x = y;
				y = z;
			}else{
				z = x;
				x = y;
				y = z;
				z = y;
				y = x;
				x = z;				
			}
			System.out.println(x + " " + y);
			x = sc.nextInt();
			y = sc.nextInt();
		}
	}
public static void main(String[] args) {
	new Main().Germany();
	}
}