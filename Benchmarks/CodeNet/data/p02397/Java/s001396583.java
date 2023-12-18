import java.util.Scanner;
class Main {
	int x,y;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		while(x != 0 || y != 0){
			if(x > y){
				System.out.println(y + " " + x);
			}else{
				System.out.println(x + " " + y);
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}