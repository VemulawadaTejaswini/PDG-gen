import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int a = Integer.parseInt(s);
        int[][] aaa = new int[a][a];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){
                aaa[i][j] = 0;
            }
        }
        for(int i = 0; i < a; i++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            for(int j = 0; j < a2; j++){
                int a3 = sc.nextInt();
                aaa[a1-1][a3-1] = 1;
            }
        }

        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){
                if(j == a - 1) {
                    System.out.print(aaa[i][j]);
                }
                else
                System.out.print(aaa[i][j] + " ");

            }
            System.out.println();
        }
    }
}

