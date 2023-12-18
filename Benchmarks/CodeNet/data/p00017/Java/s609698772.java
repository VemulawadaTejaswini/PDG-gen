import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> strlist = new ArrayList<String>();
        
        while (scanner.hasNext()) {
            strlist.add(scanner.next());
        }
        
        int number = calcNumber(strlist);
        
        StringBuilder decoded = decode(strlist, number);
        
        System.out.println(decoded);
      
        
    }
  
    public static int calcNumber(ArrayList<String> strlist) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        int number = 0;
        int maxCount = 0;
        
        for (String word : strlist) {
            if (word.length() == 3) {
                char first = word.charAt(0);
                int diff = 't' - first;
               
                StringBuilder tmpWord = new StringBuilder();
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    c += diff;
                    tmpWord.append(c);
                }
                if (tmpWord.toString().equals("the")) {
                    number = diff;
                    break;
                }
            } else if (word.length() == 4) {
                char first = word.charAt(0);
                int diff = 't' - first;
                
                StringBuilder tmpWord = new StringBuilder();
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    c += diff;
                    tmpWord.append(c);
                }
                System.out.println(tmpWord);
                System.out.println(tmpWord.equals("this"));
                if (tmpWord.toString().equals("this") || tmpWord.toString().equals("that")) {
                    number = diff;
                    System.out.println(number);
                    break;
                }
            }
        }
        System.out.println(number);
        return number;
    }
    
    public static StringBuilder decode(ArrayList<String> strlist, int number) {
        StringBuilder decoded = new StringBuilder();
        
        for (String word : strlist) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if ( c != '.') {
                    c += number;
                }
                decoded.append(c);
            }
            decoded.append(" ");
        }
        decoded.deleteCharAt(decoded.length()-1);
        return decoded;
    }

}