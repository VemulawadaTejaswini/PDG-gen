import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
        	String cards = sc.nextLine();
        	if(cards.equals("-")) {
        		break;
        	}

            int count = Integer.parseInt(sc.nextLine());;
            for(int i = 0; i < count; i++) {
            	int shuffleNum = Integer.parseInt(sc.nextLine());
            	cards = cards.substring(shuffleNum) + cards.substring(0, shuffleNum);
            }
            System.out.println(cards);
        }
    }
}
