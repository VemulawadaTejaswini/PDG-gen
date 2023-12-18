//QÂÌ® x, y ðÇÝÝA»êçðlª¬³¢ÉoÍ·évO
import java.util.*;
public class Main {

	public void doIt(){
		//ÇÝÝ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		while(x != 0 || y != 0){
			if(x > y){
				//xÆyÌoÍÊuðÏ¦é
				System.out.println(y + " " + x);
			}
			else{
				System.out.println(x + " " + y);
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}