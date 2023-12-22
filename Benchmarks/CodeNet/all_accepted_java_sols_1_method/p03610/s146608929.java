//082
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            if(i %2 != 1){
                sb.append(s.substring(i,i+1));
            }
        }
        System.out.println(sb.toString());
    }
}