
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        String[] a = { "3", "5", "7" };
        //listに全部突っ込む
        List<String> list2 = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        list2.add("3");
        list2.add("5");
        list2.add("7");
        for (int l = 1; l < 9; l++) {
            for (int i = 0; i < list2.size(); i++) {
                for (int j = 0; j < 3; j++) {
                    String s = list2.get(i) + a[j];
                    list.add(s);
                    temp.add(s);
                }
            }
            list2 = temp;
            temp = new ArrayList<>();;
        }
        int count = 0;
        for (int i = 0 ; i < list.size() ; i++) {
            if (list.get(i).contains("3") && list.get(i).contains("5") && list.get(i).contains("7") && Integer.valueOf(list.get(i)) <= n) {
                count++;
            }
        }
        System.out.println(count);
    }

}
