import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        int count = 0;
        for(int i = 0; i < 3; i++){
            if(sChar[i]==tChar[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
