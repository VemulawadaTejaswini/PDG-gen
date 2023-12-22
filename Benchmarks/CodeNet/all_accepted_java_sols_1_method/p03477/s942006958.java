import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner vd = new Scanner(System.in);
		int l = vd.nextInt() + vd.nextInt();
		int r = vd.nextInt() + vd.nextInt();
		
		vd.close();
		if(l>r)System.out.println("Left");
		if(l==r)System.out.println("Balanced");
		if(l<r)System.out.println("Right");
		
	}

}
