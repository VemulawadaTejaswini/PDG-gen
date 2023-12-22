import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] card = new int[4][13];
        for(int i = 0; i < 4;i++){
            for(int j = 0; j < 13; j++){
                card[i][j] = j + 1;
                }
        }
        for(int i = 0; i < n; i++){
            String mark = sc.next();
            int num = sc.nextInt();
            if(mark.equals("S")){
                card[0][num-1] = -1;
            }
            if(mark.equals("H")){
                card[1][num-1] = -1;
            }
            if(mark.equals("C")){
                card[2][num-1] = -1;
            }
            if(mark.equals("D")){
                card[3][num-1] = -1;
            }
        }
        for(int a = 0; a < 4; a++){
            for(int b = 0; b < 13; b++){
                if(card[a][b] != -1){
                    if(a == 0){
                        System.out.println("S " + card[a][b]);
                    }
                    if(a == 1){
                        System.out.println("H " + card[a][b]);
                    }
                    if(a == 2){
                        System.out.println("C " + card[a][b]);
                    }
                    if(a == 3){
                        System.out.println("D " + card[a][b]);
                    }
                }
            }
        }
    }
}
