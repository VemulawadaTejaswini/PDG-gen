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
                    if (i % 100 == 3) { System.out.print(" " + i); }
                    else {
                        if (i % 1000 == 3) { System.out.print(" " + i); }
                        else {
                            if (i % 10000 == 3) { System.out.print(" " + i); }
                        }
                    }
                }
            }
        }
        System.out.print("\n");
    }
}