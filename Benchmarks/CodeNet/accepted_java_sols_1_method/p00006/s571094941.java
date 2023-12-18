import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char ch[] = line.toCharArray();
        for(int i = ch.length - 1; i >= 0; i--){
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}
