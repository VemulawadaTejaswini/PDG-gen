import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        int[] outSpot = new int[n];
        for(int i=0; i<n; i++){
            outSpot[i] = sc.nextInt();
        }
        
        int[] tate = new int[3];
        int[] yoko = new int[3];
        int[] naname = new int[2];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<n; k++){
                    if(a[i][j] == outSpot[k]){
                        yoko[i]++;
                        tate[j]++;
                        if(i==0&&j==0 || i==2&&j==2){
                            naname[0]++;
                        }
                        else if(i==0&&j==2 || i==2&&j==0){
                            naname[1]++;
                        }
                        else if(i==1&&j==1){
                            naname[0]++;
                            naname[1]++;
                        }
                    }
                }
            }
        }
        
        for(int i : tate){
            if(i == 3){
                System.out.println("Yes");
                return;
            }
        }
        for(int i : yoko){
            if(i == 3){
                System.out.println("Yes");
                return;
            }
        }
        for(int i : naname){
            if(i == 3){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}