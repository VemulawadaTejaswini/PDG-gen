import java.util.*;



class Main
    {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                b[a[i] - 1] = i + 1;
            }

            for(int i = 0; i < n; i++) System.out.print(b[i] + " ");
            System.out.println();


        }
    }