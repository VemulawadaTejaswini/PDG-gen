import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] c = new char[h][w];
        int[] dx = {1,0,-1,0,1,-1,-1,1};
        int[] dy = {0,1,0,-1,1,1,-1,-1};
        for (int i=0;i<h;i++){
            c[i]=sc.next().toCharArray();
        }
        for (int i=0;i<h;i++){
            for (int j=0;j<w;j++){
                if (c[i][j]!='#'){
                    int num = 0;
                    for (int d=0;d<8;d++){
                        int ni = i +dy[d];
                        int nj = j +dx[d];
                        if (ni<0||h<=ni)continue;
                        if (nj<0||w<=nj)continue;
                        if (c[ni][nj]=='#')num++;
                    }
                    c[i][j] = (char)(num+'0');
                }
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
}
