import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[][] cards = new int[4][13];
        for(int i=0;i<cnt;i++){
            String mark = sc.next();
            int num = sc.nextInt() - 1;
            switch (mark) {
                case "S":
                    cards[0][num] = 1;
                    break;
                case "H":
                    cards[1][num] = 1;
                    break;
                case "C":
                    cards[2][num] = 1;
                    break;
                case "D":
                    cards[3][num] = 1;
                    break;
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                if(cards[i][j] != 1){
                    switch (i){
                        case 0:
                            System.out.printf("S %d%n",j+1);
                            break;
                        case 1:
                            System.out.printf("H %d%n",j+1);
                            break;
                        case 2:
                            System.out.printf("C %d%n",j+1);
                            break;
                        case 3:
                            System.out.printf("D %d%n",j+1);
                            break;
                    }
                }
            }
        }
    }
}

