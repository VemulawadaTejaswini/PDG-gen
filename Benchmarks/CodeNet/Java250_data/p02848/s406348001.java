import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] sList = sc.next().split("");
        List<String> alphabet = Arrays.asList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));

        int count = sList.length;
        
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            int index = alphabet.indexOf(sList[i]);
          
            if (index + n > 25) {
                result[i] = alphabet.get(index + n - 26);
            } else {
                result[i] = alphabet.get(index + n);
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(result[i]);
        }
    }
}