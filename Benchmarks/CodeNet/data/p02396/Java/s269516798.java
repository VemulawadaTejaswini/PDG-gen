import java.util.Scanner;
class Main{
	public void Germany() {
		Scanner sc = new Scanner(System.in);
		int x;
		int i;
		x = sc.nextInt();
		for(i=1; x!=0; i++){
		System.out.println("Case" + " " + i + ":" + " " + x);
		x = sc.nextInt();
		}
	}
	public static void main(String[] args) {
			new Main().Germany();
		}
	}