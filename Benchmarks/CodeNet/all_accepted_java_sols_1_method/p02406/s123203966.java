public class Main {
    public static void main (String[] srgs){

        // ??????????????????????????????.
        // ?????????????????? int ?????¨??????????????????.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();

        //
        for (int i = 1; i <= n; i ++) {
            if (i % 3 == 0) { System.out.print(" " + i); }
            else {
                if (i % 10 == 3) { System.out.print(" " + i); }
                else {
                    int a = i;
                    while (a > 0) {
                        if (a % 10 == 3) { System.out.print(" " + i); break; }
                        a /= 10;
                    }
                }
            }
        }
        System.out.print("\n");
    }
}