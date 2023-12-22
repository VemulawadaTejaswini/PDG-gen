import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int i = 0;
        int j = 0;
        boolean[][] card = new boolean[4][13];
        int myhand = sc.nextInt();
        for(i = 0; i < myhand; i++){
            String type = sc.next();
            int number = sc.nextInt();
            switch(type){
                case "S" :
                    card[0][number-1] = true;
                    break;
                case "H" :
                    card[1][number-1] = true;
                    break;
                case "C" :
                    card[2][number-1] = true;
                    break;
                case "D" :
                    card[3][number-1] = true;
                    break;
            }
        }
        
        for(i=0;i<4;i++){
            for(j=0;j<13;j++){
                if(card[i][j]==false){
                    switch(i){
                    case 0 :
                        System.out.println("S " + (j+1));
                        break;
                    case 1 :
                        System.out.println("H " + (j+1));
                        break;
                    case 2 :
                        System.out.println("C " + (j+1));
                        break;
                    case 3 :
                        System.out.println("D " + (j+1));
                        break;
                        
                    }
                }
            }
        }
        
        
        
        
        
        
    }
}

