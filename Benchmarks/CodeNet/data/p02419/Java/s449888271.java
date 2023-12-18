import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    
        String word;
        String text;
        int count = 0;
        word = sc.next();
        while(true){
            text = sc.next();
            if (text.equals("END_OF_TEXT")){
                break;
            }
            if(text.equals(word)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
