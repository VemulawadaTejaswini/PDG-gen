
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
             String[] a = new String[n];
             String[] b = new String[n];


            for (int i = 0; i < n; i++) {

                a[i] = scanner.next();
                b[i] = a[i];
            }


            //System.out.println(Arrays.toString(b));
            //  int count = 0;

            swap(a);
            for (int i = 0; i < n - 1; i++) {
                System.out.printf(a[i] + " ");
            }
            System.out.printf(a[n - 1]);
            System.out.println();
            System.out.println("Stable");

           // System.out.println(Arrays.toString(b));
            swap1(b);
            for (int i = 0; i < n - 1; i++) {
                System.out.printf(b[i] + " ");
            }
            System.out.printf(b[n - 1]);
            System.out.println();




            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (!a[i].equals(b[i])) {
                    flag = false;
                }

            }
            System.out.println(flag ? "Stable" : "Not stable");


        } catch (Exception e) {

        } finally {

        }

    }

    public static void swap(String[] a) {
        int count = 0;
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if ((int) a[j].charAt(1) > (int) a[j + 1].charAt(1)) {
                    String s = a[j];
                    a[j] = a[j+1];
                    a[j+1] = s;
                   // System.out.println(s);
                }
            }
        }
      //  System.out.println(count);

    }


    public static void swap1(String[] b) {

        /*for (int i = b.length-1; i > 0; i--) {
            int lrg = 0;
            int j;
            for (j = 1; j <= i; j++) {
                if (b[j].charAt(1)>b[lrg].charAt(1)){
                    lrg = j;
                }

            }
            if (b[i].charAt(1)!=b[lrg].charAt(1)) {
                String s = b[lrg];
                b[lrg] = b[i];
                b[i] = s;
              //  System.out.println(s);
            }
        }*/

        int count1 = 0;
        for (int i = 0; i <  b.length; i++) {
            int mini = i;
            for (int j = i; j < b.length; j++) {
                if ((int)b[j].charAt(1)<(int)b[mini].charAt(1)){
                    mini = j;
                   // System.out.println(min);
                }
            }
            if(i!=mini) {
                String s = b[i];
                b[i] = b[mini];
                b[mini] = s;

                //  System.out.println(s);
            }


        }


       // System.out.println(count1);
    }
}


