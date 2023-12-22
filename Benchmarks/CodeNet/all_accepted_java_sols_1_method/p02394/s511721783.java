import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int  W=scan.nextInt();
		int  H=scan.nextInt();
		int  x=scan.nextInt();
		int  y=scan.nextInt();
		int  r=scan.nextInt();

        if(W <x+r || 0 >x-r) {
        	System.out.println("No"); 	
        }
        else if(H <y+r || 0 >y-r) {
        	System.out.println("No");
        }        
        else {
        	System.out.println("Yes");
        }
	}
}

