import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cards[][] = new int[4][13];
        
        for(int i = 0; i < n; i++){
            String suits = sc.next();
            int number = sc.nextInt();
                if(suits.equals("S")){
                    cards[0][number -1] = 1;
                }else if(suits.equals("H")){
                    cards[1][number -1] = 1;
                }else if(suits.equals("C")){
                    cards[2][number -1] = 1;
                }else if(suits.equals("D")){
                    cards[3][number -1] = 1;
                }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                if(cards[i][j] != 1){
                    if(i == 0){
                        System.out.println("S " + (j + 1));
                    }else if(i == 1){
                        System.out.println("H " + (j + 1));
                    }else if(i == 2){
                        System.out.println("C " + (j + 1));
                    }else{
                        System.out.println("D " + (j + 1));
                    }
                }
            }
        }
    }
}
