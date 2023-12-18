import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String cards = sc.next();
			int m = sc.nextInt();
			if(cards.equals("-")) {
				break;
			}
for(int i=0;i<m;i++) {
	int count=sc.nextInt();
	String move=cards.substring(0,count);
	String move2=cards.substring(count);
	cards=move2+move;
}
System.out.println(cards);
		}
	}
}

