import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine().toLowerCase();
        int count = 0;

        while(true) {
        	String t = sc.nextLine();
        	if(t.equals("END_OF_TEXT")) {
        		break;
        	}
        	t = t.toLowerCase();

        	String[] wordArray = t.split(" ");
        	for(String word : wordArray) {
        		if(w.equals(word)) {
        			count++;
        		}
        	}
        }
        System.out.println(count);
    }
}
