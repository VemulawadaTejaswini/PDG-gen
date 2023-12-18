import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        final Integer[] HonPT = new Integer[] {2, 4, 5, 7, 9};
        final Integer[] PonPT = new Integer[] {0, 1, 6, 8};
        Scanner scan = new Scanner(System.in);
        char[] n = scan.nextLine().toCharArray();
        Integer num = Integer.parseInt(String.valueOf(n[n.length - 1]));
        //System.out.println(num);
        
        if (Arrays.asList(HonPT).contains(num)) {
            System.out.println("hon");
        } else if (Arrays.asList(PonPT).contains(num)) {
            System.out.println("pon");
        } else {
            System.out.println("bon");
        }

        scan.close();
    }
}
