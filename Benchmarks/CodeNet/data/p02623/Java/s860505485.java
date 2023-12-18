import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        String[] str1 = c.nextLine().split(" ");
        String[] book1 = c.nextLine().split(" ");
        String[] book2 = c.nextLine().split(" ");

        long n = Long.parseLong(str1[0]);
        long m = Long.parseLong(str1[1]);
        long k = Long.parseLong(str1[2]);

        List<Long> book11 = new ArrayList<>();
        List<Long> book22 = new ArrayList<>();

        for (int i = 0; i < book1.length; i++) {
            book11.add(Long.parseLong(book1[i]));
        }

        for (int i = 0; i < book2.length; i++) {
            book22.add(Long.parseLong(book2[i]));
        }

        book11.addAll(book22);
        Collections.sort(book11);

        int count = 0;
        long a = 0;
        for (Long book : book11) {
            a += book;
            if (a >= k) {
                break;
            }
            count++;
        }

        System.out.println(count);

    }

}