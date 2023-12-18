import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String W = sc.nextLine();
        int sum = 0;
        while(true) {
            String line = sc.nextLine();
            if(line.equals("END_OF_TEXT")) {
                break;
            }
            String[] words = line.split(" ");
            for(int i = 0; i < words.length; i++) {
                String w = words[i].toLowerCase();
                if(W.equals(w)) {
                    sum += 1;
                }
            }
        }
        
        System.out.println(sum);
    }
 }
