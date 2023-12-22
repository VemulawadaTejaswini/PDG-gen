import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int i=0;
            String word = sc.nextLine();
            String result = "";
            for(i=0; i<word.length(); i++){
                char ch = word.charAt(i);
                if (Character.isLowerCase(ch)){
                    ch = Character.toUpperCase(ch);
                }
                else if (Character.isUpperCase(ch)){
                    ch = Character.toLowerCase(ch);
                }

                result += ch;
            }

            System.out.println(result);

        }
    }
}

