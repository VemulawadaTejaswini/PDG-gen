import java.util.HashSet;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		String n1, n2;
		while(sn.hasNext()){
			n1 = sn.next();
			n2 = sn.next();
			if(n1.equals("0") && n2.equals("0")) break;
			int hit = 0;
			int blow = 0;
			for(int i  = 0; i < 4; i++){
				if(n1.charAt(i) == n2.charAt(i)) hit++;
			}
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					if(n1.charAt(i) == n2.charAt(j)) blow++;
				}
			}
			blow -= hit;
			System.out.println(hit+" "+blow);
		}
	}
}