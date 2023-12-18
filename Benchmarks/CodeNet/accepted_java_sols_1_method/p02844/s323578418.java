import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        Set<String> set = new HashSet<>();

        for(int i = 0;i <= 999;i++) {
            char[] tmp = new char[3];
            for(int j = 0;j < 3;j++) {
                tmp[2 - j] = (char) (((i / Math.pow(10, j)) % 10) + '0');
            }

            boolean isExist1 = false;
            boolean isExist2 = false;
            boolean isExist3 = false;
            for(int j = 0;j < s.length;j++) {
                if(!isExist1 && s[j] == tmp[2]) isExist1 = true;
                else if(!isExist2 && isExist1 && s[j] == tmp[1]) isExist2 = true;
                else if(!isExist3 && isExist2 && s[j] == tmp[0]) {
                    isExist3 = true;
                    break;
                }
            }

            if(isExist1 && isExist2 && isExist3) set.add(String.valueOf(tmp));
        }

        System.out.println(set.size());
    }
}
