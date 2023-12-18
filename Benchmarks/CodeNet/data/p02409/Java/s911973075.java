import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[][][] build = new int[4][3][10];

        int n = scanner.nextInt();
        int bnum, floor, room;
        int x;

        for(int i=0; i<n; i++){
            bnum = scanner.nextInt();
            floor = scanner.nextInt();
            room = scanner.nextInt();
            x = scanner.nextInt();
            build[bnum-1][floor-1][room-1] = x;
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 10; k++){
                    System.out.print(" "+build[i][j][k]);
                }
                System.out.println("");
            }
            if(i < 3)System.out.println("####################");
        }

    }
}

