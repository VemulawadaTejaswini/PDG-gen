import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int count = 0;

        while(true){
            String text = sc.next();

            if(text.equals("END_OF_TEXT"))break;

            if(word.compareToIgnoreCase(text) == 0){
                count++;
            }
        }

        System.out.printf("%d\n",count);

    }
}
