import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inner = "aa";
        char mySuffix = 'a';
        char aiSuffix = 'a';
        int iteration = 50;
        Set<String> aiAnswers = new HashSet<String>();
        while(iteration-- > 0) {
            System.out.println("?" + aiSuffix + inner + mySuffix);
            String aiAnswer = sc.next();
            if(aiAnswer.charAt(0) != mySuffix || !aiAnswers.add(aiAnswer)) {
                System.out.println("!OUT");
                return;
            }
            aiSuffix = aiAnswer.charAt(aiAnswer.length() - 1);
            inner = new StringBuilder().append(inner.charAt(0)).append((char)(inner.charAt(1) + 1)).toString();
            if (inner.charAt(1) == 'z' + 1) inner = "ba";
        }
        throw new IllegalStateException();
    }
}