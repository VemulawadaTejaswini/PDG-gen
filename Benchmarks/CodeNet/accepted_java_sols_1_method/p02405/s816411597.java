import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();

        for (;;) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            if (H == 0 && W == 0) {
                for (int i=0; i<A.size(); i=i+2) {
                    for (int j=0; j<A.get(i); j++) {
                        for (int k=0; k<A.get(i+1); k++) {
                            if ((j + k) % 2 == 0) {
                                System.out.print("#");
                            }
                            else {
                                System.out.print(".");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                break;
            }
            else {
                A.add(H);
                A.add(W);
            }
        }

    }
}
