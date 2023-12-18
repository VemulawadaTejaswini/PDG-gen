import java.util.Scanner;

class Main{
    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String [] param_line = input.split(" ", 0);
        int [] dice_no = new int[6];
        for(int i=0; i<dice_no.length; i++)
            dice_no[i] = Integer.parseInt(param_line[i]);

        // create dice class instance
        Dice dice = new Dice(dice_no);

        //System.out.println(dice);

        // dice operation
        input = in.nextLine();
        for(int i=0; i<input.length(); i++){
            switch(input.charAt(i)){
                case 'W':
                    dice.toW();
                    break;
                case 'E':
                    dice.toE();
                    break;
                case 'S':
                    dice.toS();
                    break;
                case 'N':
                    dice.toN();
                    break;
            }
            //System.out.println(dice);
            //System.out.println(input.charAt(i));
        }
        System.out.println(dice_no[dice.get(0)]);
    }
}

class Dice{

    static final int W = 6;
    static final int E = 7;
    static final int S = 8;
    static final int N = 9;

    static  final int[][] dice_table = {

    // top,front,right,left,back,bottom,W,E,S,N
        {0, 1, 2, 3, 4, 5, 9, 15, 16, 6},
        {0, 2, 4, 1, 3, 5, 17, 7, 12, 10},
        {0, 4, 3, 2, 1, 5, 13, 11, 4, 18},
        {0, 3, 1, 4, 2, 5, 5, 19, 8, 14},
        {1, 0, 3, 2, 5, 4, 12, 8, 20, 2},
        {1, 3, 5, 0, 2, 4, 21, 3, 9, 13},
        {1, 5, 2, 3, 0, 4, 10, 14, 0, 22},
        {1, 2, 0, 5, 3, 4, 1, 23, 15, 11},
        {2, 0, 1, 4, 5, 3, 4, 16, 23, 3},
        {2, 1, 5, 0, 4, 3, 20, 0, 17, 5},
        {2, 5, 4, 1, 0, 3, 18, 6, 1, 21},
        {2, 4, 0, 5, 1, 3, 2, 22, 7, 19},
        {3, 0, 4, 1, 5, 2, 16, 4, 21, 1},
        {3, 4, 5, 0, 1, 2, 22, 2, 5, 17},
        {3, 5, 1, 4, 0, 2, 6, 18, 3, 23},
        {3, 1, 0, 5, 4, 2, 0, 20, 19, 7},
        {4, 0, 2, 3, 5, 1, 8, 12, 22, 0},
        {4, 2, 5, 0, 3, 1, 23, 1, 13, 9},
        {4, 5, 3, 2, 0, 1, 14, 10, 2, 20},
        {4, 3, 0, 5, 2, 1, 3, 21, 11, 15},
        {5, 1, 3, 2, 4, 0, 15, 9, 18, 4},
        {5, 3, 4, 1, 2, 0, 19, 5, 10, 12},
        {5, 4, 2, 3, 1, 0, 11, 13, 6, 16},
        {5, 2, 1, 4, 3, 0, 7, 17, 14, 8},
    };

    private int status;

    Dice(int [] a){
        status = 0;
    }

    void toW(){
        status = dice_table[status][W];
    }

    void toE(){
        status = dice_table[status][E];
    }

    void toS(){
        status = dice_table[status][S];
    }

    void toN(){
        status = dice_table[status][N];
    }

    int get(int index){
        return dice_table[status][index];
    }


    @Override
    public String toString(){
        String str = "";
        for(int i=0; i<5; i++)
            str += dice_table[status][i] + ", ";
        str += dice_table[status][5];
        return str;
    }
}