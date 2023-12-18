import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer[] a = new Integer[3];
        a[0] = Integer.parseInt(sc.next());
        a[1] = Integer.parseInt(sc.next());
        a[2] = Integer.parseInt(sc.next());

        Arrays.sort(a);

        if(a[0] == 5) {
            if(a[1] == 5) {
                if(a[2] == 7) {
                    System.out.print("YES");
                } else {
                    System.out.print("NO");
                }
            }else {
                System.out.print("NO");
            }

        }else {
            System.out.print("NO");
        }


    }

}
