import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        boolean flag = false;
        List<Integer> list = new ArrayList<>();
        list.add(s);
        int idx = 0;
        int ans = 0;
        while (!flag) {
            int a = list.get(idx);
            if (a%2==0) {
                list.add(a/2);
            }else {
                list.add(a*3+1);
            }
            idx++;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i) == list.get(list.size()-1)) {
                    ans =list.size();
                    flag=true;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
