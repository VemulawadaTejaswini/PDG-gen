import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String searchWord = sc.next().toLowerCase();
        ArrayList<String> stringArray = new ArrayList<String>();
        String target = "";
        while(true){
            target = sc.next();
            if(target.equals("END_OF_TEXT")) break;
            stringArray.add(target.toLowerCase());
        }
        int count = 0;
        for(String str: stringArray){
            if(str.equals(searchWord)){
                count++;
            }
        }
        System.out.println(count);
    }
}
