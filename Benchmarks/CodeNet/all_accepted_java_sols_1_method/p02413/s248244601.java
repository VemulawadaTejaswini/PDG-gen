import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() + 1;
        int b = sc.nextInt() + 1;
        int[][] array1 = new int [a][b];
        int[] array2 = new int [b];

        for(int i =0; i < a; i++) {
            int total1 = 0;
            if(i == a -1) {
                break;
            }
            for(int j=0;j<b;j++) {
                if(j == b -1) {
                    array1[i][j] = total1;
                    array2[j] += total1;
                    break;
                } else {
                    int c = sc.nextInt();
                    total1 += c;
                    array1[i][j] = c;
                    array2[j] += c;
                }
            }
        }
        for(int i=0; i < a; i++) {
            if(i != a-1) {
                for(int j = 0; j < b; j++) {
                    if (j == b -1) {
                        System.out.println(array1[i][j]);
                    }else {
                        System.out.print(array1[i][j] + " ");
                    }
                }
            } else {
                for(int j = 0; j < b; j++) {
                    if (j == b -1) {
                        System.out.println(array2[j]);
                    }else {
                        System.out.print(array2[j] + " ");
                    }
                }
            }
        }
    }
}
