import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String word = input.next();
            if(word.compareTo("-") == 0)
                break;
            int times = input.nextInt();
            for(int i = 0; i < times; i ++ ){
                int num = input.nextInt();
                String sub_1 = word.substring(0, num);
                String sub_2 = word.substring(num, word.length());
                word = sub_2 + sub_1;
            }
            System.out.println(word);
        }
    }
}
