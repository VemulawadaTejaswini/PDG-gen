import java.util.*;

public class Main {

    public static void main(String arg[]) {
        try {
            Scanner scan = new Scanner(System.in);
            ArrayList<Integer> num = new ArrayList<>();
            while (scan.hasNext()) {
                int x = scan.nextInt();
                if (0 < x && x < 10001) {
                    num.add(x);
                } else {
                    System.out.println("1??????10000?????§???????????§???");
                    break;
                }
            }
            System.out.println(num.size());
            for (int i = 0; i < num.size() - 2; i++) {
                if (num.get(i) > num.get(i + 1)) {
                    int y = num.get(i);
                    num.set(i, num.get(i + 1));
                    num.set(i + 1, y);
                }
            }
            for (Integer z : num) {
                System.out.print(z + " ");
            }

        } catch (InputMismatchException ex) {
            System.out.println("1??????100?????§????????¶??°?????\?????????????????????");
        }
    }
}