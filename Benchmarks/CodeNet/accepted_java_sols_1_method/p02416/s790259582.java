import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> x = new ArrayList<String>();
        String tempx;
        int count;

        while (true) {
            tempx = sc.next();

            if (tempx.equals("0"))
                break;

            x.add(tempx);
        }

        for (int i = 0; i < x.size(); i++) {
            count = 0;
            for(int j = 0; j < x.get(i).length(); j++){
                count += Character.getNumericValue(x.get(i).charAt(j));
            }
            System.out.println(count);
        }

        sc.close();
    }
}
