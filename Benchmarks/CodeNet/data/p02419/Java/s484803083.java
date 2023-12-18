import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String W = stdIn.next().toLowerCase();
        stdIn.nextLine();
        int answer = 0;
        while(true) {
            String line = stdIn.nextLine();
            if(line.equals("END_OF_TEXT")) {
                break;
            }
            for(String word : line.toLowerCase().split(" ")) {
                if(word.equals(W)) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
