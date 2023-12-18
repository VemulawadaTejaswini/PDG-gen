import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] hate = new int[k];
        for (int i = 0; i < k; i++) {
            hate[i] = in.nextInt();
        }

        String number = n + "";
        boolean flag = false;
        int out = n;
        while (true) {
            for (int m : hate) {
                if (number.contains(m + "")) {
                    flag = true;
                    break;
                }} if (!flag){
                    System.out.println(number);
                    return;
                }else {
                    out++;
                    number=out+"";
                    flag=false;

                }
            }
        }


    }