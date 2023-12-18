import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        boolean[][] cards = new boolean[4][13];
        for(int i=0; i<4; i++){
            for(int j=0; j<13; j++){
                cards[i][j] = true;
            }
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String c = sc.next();
            int a = sc.nextInt();
            switch(c){
                case "S":
                    cards[0][a-1] = false;
                    break;
                case "H":
                    cards[1][a-1] = false;
                    break;
                case "C":
                    cards[2][a-1] = false;
                    break;
                case "D":
                    cards[3][a-1] = false;
                    break;    
            }
        }

        for(int i=0; i<4; i++){
            for(int j=0; j<13; j++){
                if(cards[i][j]){
                    switch(i){
                        case 0:
                            System.out.print("S ");
                            break;
                        case 1:
                            System.out.print("H ");
                            break;
                        case 2:
                            System.out.print("C ");
                            break;
                        case 3:
                            System.out.print("D ");
                            break;
                    }
                    System.out.println(j+1);  
                }
            }
        }

    }
}
