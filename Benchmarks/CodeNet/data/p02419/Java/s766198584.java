import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    
        String word;
        String Lower_word;
        String text;
        String Lower_text;
        int count = 0;
        word = sc.next();
        Lower_word = word.toLowerCase();
        while(true){
            text = sc.next();
            if (text.equals("END_OF_TEXT")){
                break;
            }
            Lower_text = text.toLowerCase();
            if(Lower_text.equals(Lower_word)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
