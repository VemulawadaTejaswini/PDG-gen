

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] p = new int[n][3];
        for(int i = 0; i < n; i++){
            int[] aux = p[i];
            aux[0] = scanner.nextInt();
            aux[1] = scanner.nextInt();
            aux[2] = scanner.nextInt();
        }
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i = 0; i < n; i++){
            int[] aux = p[i];
            int a0 = aux[0] + Math.max(c1,c2);
            int a1 = aux[1] + Math.max(c0,c2);
            int a2 = aux[2] + Math.max(c1,c0);
            c0 = a0;
            c1 = a1;
            c2 = a2;
//            System.out.println(c0+" "+c1+" "+c2);
        }
        System.out.println((int)Math.max(Math.max(c0,c1),c2));
    }
}
