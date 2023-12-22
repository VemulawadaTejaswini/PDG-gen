import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] pos = new int[n][3];

        for(int i = 0; i < n; i++){
            pos[i][0] = sc.nextInt();
            pos[i][1] = sc.nextInt();
            pos[i][2] = sc.nextInt();
        }
        sc.close();

        int[] curentPos = {0,0,0};
        boolean canTravel = true;
        for(int[] nextPos: pos){
            boolean canMove = false;
            if(nextPos[0] % 2 == (nextPos[1] + nextPos[2]) % 2){
                int timeDiff = nextPos[0] - curentPos[0];
                int xDiff = Math.abs(nextPos[1] - curentPos[1]);
                int yDiff = Math.abs(nextPos[2] - curentPos[2]);
                if(timeDiff >= (xDiff + yDiff)){
                    curentPos = nextPos;
                    canMove = true;
                }
            }

            if(!canMove){
                canTravel = false;
                break;
            }
        }

        if(canTravel){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}
