import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int five = 2;
		int seven = 1;
		for(int i = 0;i <3 ;i++) {
			int moji = scan.nextInt();
			if(moji == 5) {
				five -= 1;
			}else if(moji == 7) {
				seven -= 1;
			}
		}
		if(five == 0 && seven == 0) {
			System.out.print("YES");
		}else {
			System.out.println("NO");
		}
		scan.close();

	}

}
