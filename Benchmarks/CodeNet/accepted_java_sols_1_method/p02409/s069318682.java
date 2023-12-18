import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][][] data = new int[4][3][10];
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            String[] s = sc.nextLine().split(" ");
            int b = Integer.parseInt(s[0]);
            int f = Integer.parseInt(s[1]);
            int r = Integer.parseInt(s[2]);
            int c = Integer.parseInt(s[3]);
            data[b-1][f-1][r-1]+=c;
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                for(int m=0;m<10;m++){
                    sb.append(" "+data[i][j][m]);
                }
                sb.append("\n");
            }
            if(i!=3) sb.append("####################\n");
        }
        System.out.print(sb);
    }
}	
