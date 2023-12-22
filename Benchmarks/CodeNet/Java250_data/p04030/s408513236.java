import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.next().toCharArray();
        List<String> list = new ArrayList<>();
        for(int i=0;i<array.length;i++) {
            if (array[i]=='B') {
                if (list.size() != 0) {
                    list.remove(list.size()-1);
                }
            } else {
                list.add(String.valueOf(array[i]));
            }
        }
        for (String s: list) {
            System.out.print(s);
        }
        System.out.println();

    }
}