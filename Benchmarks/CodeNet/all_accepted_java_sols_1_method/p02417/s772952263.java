import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //StringBuilder bd = new StringBuilder();
        //ArrayList<Integer> A = new ArrayList<Integer>();
        int[] A = new int[26];
        Arrays.fill(A, 0);
        String str;

        while (sc.hasNext()) {
            str = sc.nextLine();

            str = str.toLowerCase();
            char[] c = str.toCharArray();

            for (int i=0; i<c.length; i++) {
                if ((int)c[i] >= 97 && (int)c[i] <= 122) {
                    A[(int) c[i] - 97] += 1;
                }
            }



        }

        for (int j = 0; j < 26; j++) {
            System.out.printf("%c : %d\n", (char)(j + 97), A[j]);
        }

/*
        while (true) {
            String str = sc.nextLine();


            str = str.toLowerCase();
            char[] c = str.toCharArray();

            if ((int)c[c.length-1] == 46) {
                for (int i=0; i<c.length; i++) {
                    if ((int)c[i] >= 97 && (int)c[i] <= 122) {
                        A[(int) c[i] - 97] += 1;
                    }
                }
                for (int j = 0; j < 26; j++) {
                    System.out.printf("%c : %d\n", (char)(j + 97), A[j]);
                }
                break;
            }
            else {
                for (int i=0; i<c.length; i++) {
                    if ((int)c[i] >= 97 && (int)c[i] <= 122) {
                        A[(int) c[i] - 97] += 1;
                    }
                }
            }
        }

 */
    }
}
