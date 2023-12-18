import java.util.*;
class Main{
    public static void mktable(short[] dice, short[][] table){
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
    }
    public static boolean check(short[] dice, short[] dice2, short[][] table){
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
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        short[][] dice_t = new short[100][6];
        short[][][] table = new short[100][100][4];

        short n = scanner.nextShort();
        for(short i = 0; i < n; i++){
            for(short j = 0; j < 6; j++)dice_t[i][j] = scanner.nextShort();
            mktable(dice_t[i], table[i]);
            for(short j = 0; j < i; j++){
                if(check(dice_t[j], dice_t[i], table[j])){
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");
    }
}

