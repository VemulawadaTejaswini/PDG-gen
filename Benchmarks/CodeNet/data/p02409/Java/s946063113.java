import java.util.Scanner;

class Main{
    static int[][][] value = new int[4][3][10];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            value[kussomendo(sc.nextInt() - 1,4)][kussomendo(sc.nextInt() - 1,3)][kussomendo(sc.nextInt() - 1,10)] = kussomendo(sc.nextInt(),10);
        }
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < 3;j++){
                for(int k = 0;k < 10;k++){
                    System.out.print(" " + value[i][j][k]);
                }
                System.out.println();
            }
            if(i <= 2) System.out.println("####################");
        }
    }

    static int kussomendo(int value,int max){
        if(value < 0) return 0;
        else if(value > mac) return max;
        return value;
    }

}