import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int five = 0;
        int seven = 0;

        String[] numbers = str.split(" ");
        for(String num: numbers){
            if(num.equals("5")){
                five++;
            }else if(num.equals("7")){
                seven++;
            }
        }

        if(five == 2 && seven == 1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
