import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prm = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < prm.length();) {
            char currentDegit = prm.charAt(i);
            int intCurrentDegit = Character.getNumericValue(currentDegit);
            sum += intCurrentDegit;
            i++;
        };
        
        if (Integer.parseInt(prm) % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}