import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.next();
        target = target.toUpperCase();
        int count = 0;
        while(true){
            String word = sc.next();
            if(word.equals("END_OF_TEXT")){break;}
            word = word.toUpperCase();
            if(word.equals(target)){count++;}
        }
        System.out.println(count);
    }
}
