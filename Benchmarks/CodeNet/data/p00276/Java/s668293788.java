import java.util.*;

public class Main{
	public static void main(String args[]){
		int q, c, a, n;
		int ccc = 0, cca = 0, can = 0;
		Scanner scan = new Scanner(System.in);
		q = scan.nextInt();
		for(int i = 0; i < q; i++){
			c = scan.nextInt();
			a = scan.nextInt();
			n = scan.nextInt();
			while(true){
				if(c >= 1 && a >= 1 && n >= 1){
					c--;
					a--;
					n--;
					can++;
				} else if(c >= 2 && a >= 1){
					c -= 2;
					a--;
					cca++;
				} else if(c >= 3){
					c -= 3;
					ccc++;
				} else{
					break;
				}
			}
			System.out.println(can + cca + ccc);
			can = 0;
			cca = 0;
			ccc = 0;
		}
	}
}