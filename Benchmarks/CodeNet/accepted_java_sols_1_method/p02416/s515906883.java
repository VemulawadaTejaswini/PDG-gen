import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            String d = sc.nextLine();
            if(d.equals("0")) {
                break;
            }

            int sum = 0;
            for(int i=0; i<d.length(); i++) {
                sum += Character.getNumericValue(d.charAt(i));
            }
            ans.add(sum);
        }

        for(int i: ans) {
            System.out.println(i);
        }
    }
}

