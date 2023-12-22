import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        // Alice,Bob got poit.
        int a = 0;
        int b = 0;
        boolean isAlice = true;
        for (int i = list.size()-1; i >= 0; i--){
            if (isAlice) {
                a += list.get(i);
            } else {
                b += list.get(i);
            }
            isAlice = !isAlice;
        }
        // 出力
        System.out.println(a-b);
    }
}
