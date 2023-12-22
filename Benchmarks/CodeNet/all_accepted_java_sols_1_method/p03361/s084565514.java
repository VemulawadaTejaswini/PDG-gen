import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int s[][] = new int[h+2][w+2];
        for(int i = 0;i<h+2;i++){
            for(int j = 0;j<w+2;j++){
                s[i][j] = 0;
            }
        }
        for(int i = 0;i<h;i++){
            String kariS = sc.next();
            for(int j = 0;j<w;j++){
                if(kariS.charAt(j)=='#'){
                    s[i+1][j+1] = 1;
                }
            }
        }
        for(int i = 1;i<(h+1);i++){
            for(int j = 1;j<(w+1);j++){
                if(s[i][j] == 1){
                    if((s[i-1][j]==0) && (s[i][j-1]==0) && (s[i+1][j]==0) && (s[i][j+1]==0)){
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
        sc.close();
    }
}