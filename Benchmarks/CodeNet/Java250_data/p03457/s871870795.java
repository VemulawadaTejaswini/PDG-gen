import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        final int T = 0;
        final int X = 1;
        final int Y = 2;
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] travel = new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                travel[i][j] = Integer.parseInt(sc.next());
            }
        }
        boolean can = true;
        int pt=0, px=0, py=0;
        for(int i=0;i<n;i++){
            int d = length(px, py, travel[i][X], travel[i][Y]);
            int t = travel[i][T] - pt;
            if(d>t){
                can = false;
                break;
            }else if((t-d)%2==1){
                can = false;
                break;
            }
            px = travel[i][X]; py=travel[i][Y]; pt=travel[i][T];
        }
        if(can){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    static int length(int px, int py, int cx, int cy){
        return(Math.abs(cx-px)+Math.abs(cy-py));
    }
}