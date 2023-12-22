import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        char[][] array = new char[y][x];
        int[] dy = {-1,0,0,1};
        int[] dx = {0,-1,1,0};
        for(int i = 0; i<y; i++) {
            String s = sc.next();
            for(int j=0; j<x; j++) {
                array[i][j] = s.charAt(j);
            }
        }
        for(int i = 0; i<y; i++) {
            for(int j=0; j<x; j++) {
                if(array[i][j] == '#'){
                    int count = 0;
                    for(int k=0; k<4; k++) {
                        int ni = i + dy[k];
                        int nj = j + dx[k];
                        if(ni <0 || y<=ni) continue;
                        if(nj <0 || x<=nj) continue;
                        if(array[ni][nj]=='#') count++;
                    }
                    if(count == 0) {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}