import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        boolean[][] cards = new boolean[4][13];
        for(int i = 0; i < x; i++){
            String s = input.next();
            int num = input.nextInt();
            switch(s){
                case "S":
                    cards[0][num-1] = true;
                    break;
                case "H":
                    cards[1][num-1] = true;
                    break;
                case "C":
                    cards[2][num-1] = true;
                    break;
                case "D":
                    cards[3][num-1] = true;
                    break;
            }
        }
        for(int i = 0; i < cards.length; i++){
            for(int n = 0; n < cards[i].length; n++){
                if(!cards[i][n]){
                    switch(i){
                        case 0:
                            System.out.println("S "+(n+1));
                            break;
                        case 1:
                            System.out.println("H "+(n+1));
                            break;
                        case 2:
                            System.out.println("C "+(n+1));
                            break;
                        case 3:
                            System.out.println("D "+(n+1));
                            break;
                    }
                }
            }
        }
    }
}