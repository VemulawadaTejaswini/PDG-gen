import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int H = sc.nextInt();
int W = sc.nextInt();
char[][] s=new char[H][W];
for(int i=0;i<H;i++){
    String p = sc.next();
    for(int j=0;j<W;j++){
        s[i][j]=p.charAt(j);
    }
}
int[] dx={0,1,0,-1};
int[] dy={1,0,-1,0};
for (int i = 0; i < H; i++) {
    for (int j = 0; j < W; j++) {
        int c=0;
        if(s[i][j]=='#'){
            for (int k = 0; k < 4; k++) {
                int x=j+dx[k];
                int y=i+dy[k];
                if(0<=x&&x<W&&0<=y&&y<H){
                    if(s[y][x]=='#')c++;
                }
            }
            if(c==0){
                out.println("No");exit(0);
            }
        }
    }
}
    out.println("Yes");
}}