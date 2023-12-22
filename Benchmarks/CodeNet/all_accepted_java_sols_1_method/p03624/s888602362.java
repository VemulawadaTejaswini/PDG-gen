import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int[] alphabet = new int[26];
        for(int i = 0; i < S.length(); i++){
            alphabet[S.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(alphabet[i] == 0){
                System.out.println((char)('a' + i));
                return;
            }
        }
        System.out.println("None");
    }
}
