import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counter = new int[26];
        while (input.hasNext()){
            String S = input.nextLine();
            for (int i = 0; i < S.length(); i++){
                char c = S.charAt(i);
                if (Character.isUpperCase(c)){
                    c += 32;
                    counter[(int)c-97] += 1;
                } else if (Character.isLowerCase(c)){
                    counter[(int)c-97] += 1;
                }
            }
        }
        for (int i = 0; i < 26; i++){
            char c = (char)(97+i);
            System.out.printf("%s : %d\n",c,counter[i]);
        }
    }
}
