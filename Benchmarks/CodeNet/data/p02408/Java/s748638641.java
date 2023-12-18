import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] cards = new int[4][13];
        
        for(int i = 1 ; i <= n ; i++){
            String mark = sc.next();
            int num = sc.nextInt();
            switch(mark){
                case "S":
                    cards[0][num-1] = 1;
                    break;
                case "H":
                    cards[1][num-1] = 1;
                    break;
                case "C":
                    cards[2][num-1] = 1;
                    break;
                case "D":
                    cards[3][num-1] = 1;
                    break;
            }
        }
        
        for(int i = 1 ; i <= 4 ; i++){
            for(int j = 1 ; j <= 13 ; j++){
                if(cards[i-1][j-1] != 1){
                    if(i == 1){
                        System.out.println("S" + " " + j);
                    } else if (i == 2){
                        System.out.println("H" + " " + j);
                    } else if (i == 3){
                        System.out.println("C" + " " + j);
                    } else {
                        System.out.println("D" + " " + j);
                    }
                }
            }
        }
        
    }
}
