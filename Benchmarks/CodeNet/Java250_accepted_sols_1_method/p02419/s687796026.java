import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String w = scan.nextLine();
        String t = scan.next();
        int sum = 0;
        while(!t.equals("END_OF_TEXT")) {
            if (t.length() == w.length()) {
                for (int x = 0; x < t.length(); x++){
                    if (Character.toString(t.charAt(x)).equalsIgnoreCase(Character.toString(w.charAt(x)))) {
                        if (x == t.length() - 1) {
                            sum++;
                        }
                    }
                    else {
                        x = t.length();
                    }
                }
            }
            t = scan.next();
        }
        System.out.println(sum);
    }
}
