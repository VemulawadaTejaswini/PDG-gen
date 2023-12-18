import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int hDisp[] = new int[h];
        int wDisp[] = new int[w];
        char table[][] = new char[h][w];
        
        for(int i=0; i<h; i++){
            hDisp[i] = 0;
        }
        for(int j=0; j<w; j++){
            wDisp[j] = 0;
        }
        
        for(int i=0; i<h; i++){
            String line = sc.next();
            for(int j=0; j<w; j++){
                table[i][j] = line.charAt(j);
                if('.' == table[i][j]){
                    hDisp[i]++;
                    wDisp[j]++;
                }
            }
        }
        
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(!(hDisp[i] == w || wDisp[j] == h)){
                    System.out.print(table[i][j]);
                }
            }
            if(hDisp[i] != w){
                System.out.println();
            }
        }
    }
}
