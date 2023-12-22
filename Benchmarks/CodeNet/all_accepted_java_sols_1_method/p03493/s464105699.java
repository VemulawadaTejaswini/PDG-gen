import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        int cnt = 0;
        for(int i = 0;i < m.length();i++){
            if(m.charAt(i) == '1')
            cnt++;
        }
        System.out.println(cnt);

    }
}