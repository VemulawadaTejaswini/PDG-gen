import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] dice = new int[6];
        int[][] table = new int[100][4];
        for(int i = 0; i < 6; i++)dice[i] = scanner.nextInt();

        table[dice[0]][0] = dice[1];
        table[dice[0]][1] = dice[2];
        table[dice[0]][2] = dice[4];
        table[dice[0]][3] = dice[3];

        table[dice[1]][0] = dice[0];
        table[dice[1]][1] = dice[3];
        table[dice[1]][2] = dice[5];
        table[dice[1]][3] = dice[2];

        table[dice[2]][0] = dice[0];
        table[dice[2]][1] = dice[1];
        table[dice[2]][2] = dice[5];
        table[dice[2]][3] = dice[4];

        table[dice[3]][0] = dice[0];
        table[dice[3]][1] = dice[4];
        table[dice[3]][2] = dice[5];
        table[dice[3]][3] = dice[1];

        table[dice[4]][0] = dice[0];
        table[dice[4]][1] = dice[2];
        table[dice[4]][2] = dice[5];
        table[dice[4]][3] = dice[3];

        table[dice[5]][0] = dice[1];
        table[dice[5]][1] = dice[3];
        table[dice[5]][2] = dice[4];
        table[dice[5]][3] = dice[2];
        int q = scanner.nextInt();
        for(int i = 0; i < q; i++){
            int top = scanner.nextInt();
            int fnt = scanner.nextInt();
            for(int j = 0; j < 4; j++){
                if(table[top][j] == fnt){
                    System.out.println(table[top][(j+1)%4]);
                    break;
                }
            }
        }
    }
}
