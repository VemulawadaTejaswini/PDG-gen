import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        if (a == 5 && b == 5) {
            String[] arr = getComb(4, 4);
            for (String s : arr) {
                sb.append(s).append("AB").append("\n");
                sb.append(s).append("BA").append("\n");
            }
        } else if (a == 6) {
            String[] arr = getComb(4, 4);
            for (String s : arr) {
                sb.append(s).append("AA").append("\n");
            }
        } else if (b == 6) {
            String[] arr = getComb(4, 4);
            for (String s : arr) {
                sb.append(s).append("BB").append("\n");
            }
        } else if (a == 5) {
            String[] arr = getComb(a - 1, b);
            for (String s : arr) {
                sb.append(s).append("A").append("\n");
            }
        } else if (b == 5) {
            String[] arr = getComb(a, b - 1);
            for (String s : arr) {
                sb.append(s).append("B").append("\n");
            }
        } else {
            String[] arr = getComb(a, b);
            for (String s : arr) {
                sb.append(s).append("\n");
            }
        }
        System.out.print(sb);
    }
    
    static String[] getComb(int a, int b) {
        if (a == 0 && b == 0) {
            return new String[]{""};
        }
        if (a == 0) {
            String[] arr = getComb(a, b - 1);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = "B" + arr[i];
            }
            return arr;
        } else if (b == 0) {
            String[] arr = getComb(a - 1, b);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = "A" + arr[i];
            }
            return arr;
        } else {
            String[] arr1 = getComb(a - 1, b);
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = "A" + arr1[i];
            }
            String[] arr2 = getComb(a, b - 1);
             for (int i = 0; i < arr2.length; i++) {
                arr2[i] = "B" + arr2[i];
            }
            int length = arr1.length + arr2.length;
            String[] arr = new String[length];
            for (int i = 0; i < length; i++) {
                if (i < arr1.length) {
                    arr[i] = arr1[i];
                } else {
                    arr[i] = arr2[i - arr1.length];
                }
            }
            return arr;
       }
    }
}
