import java.util.*;

// Iroha's Strings
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String params = scanner.nextLine();
        int numStrings = scanner.nextInt();
        int stringLen = scanner.nextInt(); 
        scanner.nextLine();
        // scanner.next() reads up until \n it won't consume it. You need next Line to pusition the 
        // System.out.println(scanner.nextLine()); // handle of first line \n that is

        List<String> strings = new ArrayList<>();
        for (int i=0; i<numStrings; i++) {
            String curr = scanner.nextLine();
            // System.out.println("curr" + curr);
            strings.add(curr);
        }
        // I have the strings now simply sort them and concatenate
        Collections.sort(strings);
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            // System.out.printf("String:%s, numStrings:%d, stringLen:%d %n", s, numStrings, stringLen);
            sb.append(s);
        }                       
        scanner.close();            
        System.out.println(sb.toString());
    }
    
}