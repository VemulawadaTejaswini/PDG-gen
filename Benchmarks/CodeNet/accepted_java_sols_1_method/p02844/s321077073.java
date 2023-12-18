import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        String s = stdIn.next();
        char [] cs = s.toCharArray();
        int [] is = new int [cs.length];
        for(int i=0; i<is.length; i++){
            is[i] = (int)(cs[i] - '0');
        }

        int [][] a = new int [10][30000];
        int [] iN = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for(int i=0; i<n; i++){
            a[is[i]][iN[is[i]]++] = i;
        }

        int counter = 0;
        for(int i=0; i<=9; i++){
            int idxI = -1;
            for(int l=0; l<iN[i]; l++){
                if(a[i][l] >= 0){
                    idxI = a[i][l];
                    break;
                }
            }
            if(idxI == -1){
                continue;
            }
            for(int j=0; j<=9; j++){
                int idxJ = -1;
                for(int l=0; l<iN[j]; l++){
                    if(a[j][l] > idxI){
                        idxJ = a[j][l];
                        break;
                    }
                }
                if(idxJ == -1){
                    continue;
                }
                for(int k=0; k<=9; k++){
                    int idxK = -1;
                    for(int l=0; l<iN[k]; l++){
                        if(a[k][l] > idxJ){
                            counter++;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(counter);
    }
}