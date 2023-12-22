import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int b;
        int f;
        int r;
        int v;
        n = sc.nextInt();
        int house[][][];
        house = new int[4][3][10];//[building],[floor],[room]
        int i,j,k;
        for(i=0;i<4;i++){
            for(j=0;j<3;j++){
                for(k=0;k<10;k++){
                    house[i][j][k] = 0;
                }
            }
        }
        int count;
        for(count=0;count<n;count++){
            b = sc.nextInt();            
            f = sc.nextInt();            
            r = sc.nextInt();            
            v = sc.nextInt();
            house[b-1][f-1][r-1] += v;
            //System.out.println("ok");
        }

        for(i=0;i<4;i++){
            for(j=0;j<3;j++){
                for(k=0;k<10;k++){
                    System.out.print(" " + house[i][j][k]);
                }
                System.out.println("");
            }
            if(i<3){
                System.out.println("####################");
            }
        }
        sc.close();
    }
}
