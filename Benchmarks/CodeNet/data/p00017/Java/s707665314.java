import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Character> al = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            al.add(i);
        }

        while (sc.hasNextLine()) {
            String S = sc.nextLine();

            String ans = "";
            for (int i = 0; i < 27; i++) {
                StringBuilder tmp = new StringBuilder();

                for (int j = 0; j < S.length(); j++) {
                    if (Character.isLetter(S.charAt(j))) {
                        int index = al.indexOf(S.charAt(j)) + i;

                        if (index >= al.size()) {
                            index %= al.size();
                        }
                        tmp.append(al.get(index));
                    } else {
                        tmp.append(S.charAt(j));
                    }
                }

                if (tmp.toString().contains("the") || tmp.toString().contains("this") || tmp.toString().contains("that")){
                    ans = tmp.toString();
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}