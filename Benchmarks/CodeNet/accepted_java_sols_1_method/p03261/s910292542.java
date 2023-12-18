import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        List<String> words = new ArrayList<String>();
        boolean isRight = true;
        while(in.hasNextLine()) {
        	String cache = in.nextLine();
            if (words.contains(cache)) {
            	isRight = false;
            	break;
            }
            words.add(cache);
        }
        in.close();
        if (isRight) {
        	char a = ' ';
        	for(String word : words) {
        		if (a == ' ' || a == word.charAt(0)) {
        		a = word.charAt(word.length() - 1);
        		} else {
        			isRight = false;
        		}
        	}
        }
        String ans = isRight ? "Yes" : "No";
        System.out.println(ans);
    }
}