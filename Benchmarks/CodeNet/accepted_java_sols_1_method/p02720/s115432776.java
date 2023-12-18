import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        String[] lunlun = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        List<String> lunlunList = new ArrayList<>(Arrays.asList(lunlun));
        int index = 0;
        while (lunlunList.size() <= 100000) {
            String str = lunlunList.get(index);
            int num = Integer.parseInt(String.valueOf(str.charAt(str.length() - 1)));
            if (num != 0) {
                lunlunList.add(str + (num - 1));
            }
            lunlunList.add(str + num);
            if (num != 9) {
                lunlunList.add(str + (num + 1));
            }
            index++;
        }

        String result = lunlunList.get(k - 1);

        // 出力
        System.out.println(result);
    }
}
