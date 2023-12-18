
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		while(x != 0 || y != 0){
			if(x < y){
				int temp = x;
				x = y;
				y = temp;
			}
			//ツ催妥・ツ古カツ姪アツ青板づーツ仰づ淞づゥ
			int count = 0;
			while(y != 0){
				int temp = x % y;
				x = y;
				y = temp;
				count++;
			}
			System.out.println( x +" " + count);

			x = sc.nextInt();
			y = sc.nextInt();
		}


	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}