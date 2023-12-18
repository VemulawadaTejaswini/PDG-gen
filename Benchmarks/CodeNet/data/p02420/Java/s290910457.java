import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String cards = sc.next();
			if(cards.equals("-")) {
				break;
			}
			int m = sc.nextInt();
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

