import java.awt.event.TextEvent;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            int c = sc.nextInt();

            int excel[][] = new int[r+1][c+1];
            int num = 0;
            int num2 = 0;
            int num3 = 0;
            for(int i=0 ; i < r ; i++){
                for(int j=0 ; j < c ; j++){
                    excel[i][j] = sc.nextInt();
                    if(j == c-1){
                        num += excel[i][j];
                        excel[i][j+1] = num;
                        num = 0;
                    }else{
                        num += excel[i][j];
                    }
                }
            }

            for(int k=0 ; k < c ; k++) {
                for (int l = 0; l < r; l++) {
                    if(l == r-1){
                        num2 += excel[l][k];
                        excel[l+1][k] = num2;
                        num2 = 0;
                    }else{
                        num2 += excel[l][k];
                    }
                }
            }
            for(int i=0; i<r ;i++){
                num3 += excel[i][c];
            }
            excel[r][c] = num3;

            for( int i=0; i<r+1; i++ ) {
                for( int j=0; j<c+1; j++ ) {
                    if(j==c){
                        System.out.print(excel[i][j]);
                    }else {
                        System.out.print(excel[i][j] + " ");
                    }
                }
                System.out.println( "" );
            }
    }
}

