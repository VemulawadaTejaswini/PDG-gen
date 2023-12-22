import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] cs = sc.next().toCharArray();

        int count = 0;
        for (int i = 0; i < cs.length; i++) {
            if(cs[i] == '1'){
                count += 1;
            }
        }

        System.out.print(count);
    }
}