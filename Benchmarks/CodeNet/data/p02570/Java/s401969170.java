import java.util.Scanner;

/**
 *
 * @author shota
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        
        String searchWord = "";
        int count = 0;
        for(int i = 0; i < t.length(); i++) {
            searchWord = searchWord + t.substring(i, i+1);
            if(!s.matches(searchWord +".*")) {
                searchWord = searchWord.substring(0, i) + "\\[a-z]";
                count++;
            }
        }
        System.out.print(count);
    }
}