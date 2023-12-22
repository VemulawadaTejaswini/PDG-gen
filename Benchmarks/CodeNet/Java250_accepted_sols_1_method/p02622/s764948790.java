import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        char[] t = sc.nextLine().toCharArray();
        int incorrect = 0;
        for(int i = 0;i < s.length;i++){
            if(s[i] != t[i]) incorrect++;
        }
        System.out.println(incorrect);
    }
}
