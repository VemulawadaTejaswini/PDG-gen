import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] box = new int [r+1][c+1];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                box[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                box[i][c] += box[i][j];
            }
        }
        for(int j=0;j<r;j++){
            for(int i=0;i<c+1;i++){
                box[r][i] += box[j][i];
            }
        }
        for(int i=0;i<r+1;i++){
            for(int j=0;j<c+1;j++){
                System.out.print(box[i][j]);
                	if(j != c)
                        System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
