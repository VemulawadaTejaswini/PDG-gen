import javax.swing.text.Position;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int N, M;
        boolean[][] field = new boolean[21][21];
        while((N=scan.nextInt()) != 0){
            int positionX = 10;
            int positionY = 10;
            int count = 0;

            for(int i=0; i< 21; i++){
                for(int j=0; j<21; j++){
                    field[i][j] = false;
                }
            }

            for(int i=0; i<N; i++){
                int x = scan.nextInt();
                int y = scan.nextInt();
                field[y][x] = true;
            }

            M = scan.nextInt();

            for(int i=0; i<M; i++){
                String d = scan.next();
                int j = scan.nextInt();

                for(int k=0; k<j; k++) {
                    switch(d.charAt(0)){
                        case 'N':
                            positionY++;
                            break;
                        case 'E':
                            positionX++;
                            break;
                        case 'W':
                            positionX--;
                            break;
                        case 'S':
                            positionY--;
                            break;
                        default:
                            System.exit(-1);
                    }

                    if (field[positionY][positionX] == true) {
                        count += 1;
                        field[positionY][positionX] = false;
                    }
                }
            }

            if(count == N){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        }
    }
}