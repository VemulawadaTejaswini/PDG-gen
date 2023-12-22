import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char [][] board = new char[H][W];

        for(int i=0;i<H;i++){
            String tmp = sc.next();
            for(int j=0;j<W;j++){
                board[i][j] = tmp.charAt(j);
            }
        }
        int [] dx ={1,1,0,-1,-1,-1,0,1};
        int [] dy ={0,1,1,1,0,-1,-1,-1};
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(board[i][j] =='#'){
                    System.out.print("#");
                }else{
                    int sum =0;
                    for(int k=0;k<8;k++){
                        int x = j+dx[k];
                        int y = i+dy[k];
                        if(0>x || x>W-1){
                            continue;
                        }
                        if(0>y || y>H-1){
                            continue;
                        }
                        if(board[y][x]=='#'){
                            sum++;
                        }
                    }
                    System.out.print(sum);
                }
            }
            System.out.println();
        }
    }
}