import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        String sub = scan.nextLine();

        int min = 0;

        for (int i = 0; i <= s.length()-sub.length(); i++){
            String sSub = s.substring(i,i+sub.length());
            int count = 0;
            for (int j = 0; j < sub.length(); j++){
                if (sSub.charAt(j) != sub.charAt(j)){
                    count++;
                }
            }
            if (i == 0)
                min = count;
            else if (count < min)
                min = count;
        }

        System.out.println(min);
    }
}
