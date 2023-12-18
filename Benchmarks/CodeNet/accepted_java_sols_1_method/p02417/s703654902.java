import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
            int[] counter = new int[128];
            while(stdIn.hasNext()) {
                String str = stdIn.nextLine().toLowerCase();
                for(int i = 0; i < str.length(); i++) {
                    counter[str.charAt(i)]++;
                }
            }
            for(char ch = 'a'; ch <= 'z'; ch++) {
                System.out.println(ch + " : " + counter[ch]);
            }
        
    }
}
