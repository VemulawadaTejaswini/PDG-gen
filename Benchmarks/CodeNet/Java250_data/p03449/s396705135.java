import java.util.Scanner;

class Main {
    private static int calcScore(int[][] a, int down) {

        int count = 0;
        for (int j = 0; j < a[0].length; j++) {
            if (j == down) {
                count += a[0][j];
                count += a[1][j];
            }else if( j < down){
                count += a[0][j];
            }else  if(j > down){
                count += a[1][j];               
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String A1 = sc.nextLine();
        String A2 = sc.nextLine();
        sc.close();
        String[] a1_ary = A1.split(" ");
        String[] a2_ary = A2.split(" ");
        int[] a1 = new int[N];
        int[] a2 = new int[N];
        int[][] a = new int[2][N];
        int max = 0;

        for (int i = 0; i < N; i++) {
            a1[i] = Integer.valueOf(a1_ary[i]);
            a2[i] = Integer.valueOf(a2_ary[i]);
        }
        for (int i = 0; i < N; i++) {
            a[0][i] = a1[i];
        }
        for (int i = 0; i < N; i++) {
            a[1][i] = a2[i];
        }

        for (int i = 0; i < N; i++) {
            max = Math.max(calcScore(a, i), max);
        }

        System.out.println(max);
    }
}
