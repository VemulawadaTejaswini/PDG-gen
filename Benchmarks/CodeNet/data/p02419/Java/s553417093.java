import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO 自動生成されたメソッド・スタブ
           Scanner scan = new Scanner(System.in);
           int count = 0;
           String read = scan.next().toLowerCase();
           while(true){
               String input = scan.next();
               if(input.equals("END_OF_TEXT")){
                   break;
               }
               if(input.toLowerCase().equals(read)){
                   count++;
               }
           }
           System.out.println(count);
    }

}
