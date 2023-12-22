import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] c = new int[3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = Integer.parseInt(sc.next());
            }
        }
        int[] t = new int[6] ;
        t[0] = c[0][0] + c[1][1] + c[2][2];
        t[1] = c[0][1] + c[1][2] + c[2][0];
        t[2] = c[0][2] + c[1][0] + c[2][1];
        t[3] = c[0][2] + c[1][1] + c[2][0];
        t[4] = c[0][1] + c[1][0] + c[2][2];
        t[5] = c[0][0] + c[2][1] + c[1][2];
        
        String ans = "Yes";
        for(int i = 1;i<6;i++){
            if(t[i] != t[0]){
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }
    
}