import java.util.*;

public class Main {
    List<String> list = new ArrayList<String>();
    Map<Integer,Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        sc.close();
        int count1 = 0;
        int count0 = 0;
        int x = 0;
        int lenT = T.length();
        int max = lenT;
        for (int i = 0; i < lenT; i++) {
            if (T.charAt(i) == '1') {
                count1++;
            }else if(T.charAt(i) == '0'){
                count0++;
            }
        }
        if(count1 == 0){
            System.out.println(0);
        }

        System.out.println();
    }
}
