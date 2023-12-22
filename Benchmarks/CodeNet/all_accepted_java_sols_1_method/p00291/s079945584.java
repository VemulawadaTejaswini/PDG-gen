import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int i1 =scan.nextInt();
		int i5 =scan.nextInt();
		int i10 =scan.nextInt();
		int i50 =scan.nextInt();
		int i100 =scan.nextInt();
		int i500 =scan.nextInt();
		if(i1 + i5*5 + i10*10 + i50*50 + i100*100 + i500*500 >=1000){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
}