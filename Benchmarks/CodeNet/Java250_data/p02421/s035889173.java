import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String n = scan.nextLine();
	int cnt = Integer.valueOf(n);
	int taro = 0;
	int hanako = 0;
	for (int i = 0; i < cnt; i++) {
	    String fuda = scan.nextLine();
	    String[] cards = fuda.split(" ");
	    if (cards[0].compareTo(cards[1]) == 0) {
		taro += 1;
		hanako += 1;
	    } else if (cards[0].compareTo(cards[1]) < 0) {
		hanako += 3;
	    } else if (cards[0].compareTo(cards[1]) > 0) {
		taro += 3;
	    }
	}
	System.out.println(taro + " " + hanako);
    }
}