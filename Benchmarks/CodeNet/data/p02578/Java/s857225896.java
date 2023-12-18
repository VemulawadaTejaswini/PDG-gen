import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iTotalHurman = Integer.parseInt(sc.nextLine());
        List<Integer> listHeight = new LinkedList<>();
        int springBoard = 0;
        for (int i = 0; i < iTotalHurman; i++) {
            listHeight.add(Integer.parseInt(sc.next()));

            if (0 == i) {
                continue;
            }
            int compHeight = listHeight.get(i);
            int previosHeight = listHeight.get(i - 1);
            while (previosHeight > compHeight) {
                compHeight++;
                springBoard++;
            }
            listHeight.set(i, compHeight);
        }
        System.out.print(springBoard);
    }
}
