import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int[][] tab = new int[r+1][c+1];
        
        for(int i = 0; i < r+1; i++){
            for(int j = 0; j < c+1; j++){
                tab[i][j] = 0;
            }
        }
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
            	int nec =  sc.nextInt();
                tab[i][j] = nec;
                tab[i][c]+= nec;
                tab[r][j]+= nec;
                tab[r][c]+= nec;
            }
        }
        
         for(int i = 0; i < r+1; i++){
            for(int j = 0; j < c+1; j++){
                if(j == c){
                    System.out.printf("%d",tab[i][j]);
                }else{
                    System.out.printf(tab[i][j] + " ");
                }
            }
            System.out.printf("\n");
        }
    }
}
