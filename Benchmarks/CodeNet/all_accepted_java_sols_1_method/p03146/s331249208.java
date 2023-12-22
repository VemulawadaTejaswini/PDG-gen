import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(s);

        int index = 1;
        while(true) {
            index++;
            int value = s % 2 == 0 ? s / 2 : 3 * s + 1;
            if (list.contains(value)) {
                break;
            } else {
                list.add(value);
                s = value;
            }
        }

        // 出力
        System.out.println(index);
    }
}