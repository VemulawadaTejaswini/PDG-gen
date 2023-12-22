

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int[] arr = inputval();
        int A, B;
        String S;
        A = arr[0];
        B = arr[1];
        S = br.readLine().trim();
        String str = "No";

        for (int i = 0; i < A + B + 1; i++) {
            if (i == A) {
                if (S.charAt(i) != '-') break;
            }else{
                if(!('0' <= S.charAt(i) && S.charAt(i) <= '9')) break;
            }
            if(i==A+B) str = "Yes";
        }
        System.out.println(str);
    }


    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    static void array_sout(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void array_sout(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}