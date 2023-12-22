import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmpS = scanner.next();
        String S[] = tmpS.split("");
        String tmpT = scanner.next();
        String T[] = tmpT.split("");
        int count = 0;

        scanner.close();
        for (int i = 0; i < tmpS.length(); i++){
            if (!(S[i].equals(T[i]))){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
