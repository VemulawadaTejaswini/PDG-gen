import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String word = scanner.next();
        String answer = "";
        for(int i = 0; i < word.length(); i ++){
            int current = word.charAt(i);
            if(current + number > 90){
                answer+= (char)( current + number - 90 + 64 );
            }
            else{
                answer += (char)(current + number);
            }
        }
        System.out.println(answer);
    }
}