import java.util.Scanner;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int count=0;
        while(true){
            String text = sc.next();
            if(text.equalsIgnoreCase("END_OF_TEXT")){
                break;
            }else if(text.equals(word)){
                count++;
            }
        }
        System.out.println(count);
    }
}

