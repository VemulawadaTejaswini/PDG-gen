import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String deck = scan.nextLine();
        while(!deck.equals("-")) {
            int a = scan.nextInt();
            for(int x = 0; x < a; x++){
                int s = scan.nextInt();
                String half = deck.substring(0, s);
                String rest = deck.substring(s);
                deck = rest + half;
            }
            System.out.println(deck);
            deck = scan.nextLine();
            deck = scan.nextLine();
        }
    }
}
