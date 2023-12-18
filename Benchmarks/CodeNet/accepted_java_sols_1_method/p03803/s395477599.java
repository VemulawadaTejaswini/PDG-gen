import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String j = scanner.nextLine();
        String[] tmpcards = j.split(" ");
        int[] cards = new int[3];
        for (int i = 0; i < 2; i++){
            cards[i] = Integer.parseInt(tmpcards[i]);
            if (cards[i] == 1)
                cards[i] += 13;
        }
        if (cards[0] == cards[1]){
            System.out.println("Draw");
        } else {
            System.out.println(cards[0] > cards[1]?"Alice":"Bob");
        }
    }
}