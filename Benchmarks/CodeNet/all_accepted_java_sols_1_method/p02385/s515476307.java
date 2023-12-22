import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] dice = new int[6];
        int[] dice2 = new int[6];
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

        for(int i = 0; i < 6; i++)dice2[i] = scanner.nextInt();
        int top, k;
        for(top = 0; top < 6; top++){
            if(dice2[0] == dice[top]){
                for(k = 0; k < 4; k++){
                    if(dice2[1] == table[dice[top]][k]){
                        if(dice2[2] != table[dice[top]][(k+1)%4])break;
                        if(dice2[4] != table[dice[top]][(k+2)%4])break;
                        if(dice2[3] != table[dice[top]][(k+3)%4])break;
                        for(int l = 0; l < 4; l++){
                            if(dice2[5] == table[table[dice[top]][0]][l]){
                                System.out.println("Yes");
                                System.exit(0);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("No");
    }
}

