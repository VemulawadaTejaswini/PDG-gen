import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s, text[];
        text = new String[10000000];
        int count = 0;
        s = sc.next();

        int i = 0;
        while(true){
            text[i] = sc.next();

            if(text[i].equals("END_OF_TEXT")){
                break;
            }

            text[i] = text[i].toLowerCase();

            if(text[i].equals(s)){
                count++;
            }

            ++i;
        }
        System.out.println(count);
    }
}

