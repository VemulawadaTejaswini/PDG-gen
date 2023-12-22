import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        char[][] map = new char[h][w];

        for(int i=0;i<h;i++){
            String s = sc.next();
            map[i] = s.toCharArray();
        }

        for(int i=0;i<h;i++)for(int j=0;j<w;j++){
            int mine = 0;
            if(map[i][j]=='.'){

                if(i>0){//上3つ
                    if(j>0)if(map[i-1][j-1]=='#')mine++;
                    if(map[i-1][j]=='#')mine++;
                    if(j<w-1)if(map[i-1][j+1]=='#')mine++;
                }
                if(i<h-1){//下３つ
                    if(j>0)if(map[i+1][j-1]=='#')mine++;
                    if(map[i+1][j]=='#')mine++;
                    if(j<w-1)if(map[i+1][j+1]=='#')mine++;
                }
                if(j>0&&map[i][j-1]=='#')mine++;
                if(j<w-1&&map[i][j+1]=='#')mine++;
                String temp = ""+mine;
                char[] temp2 = temp.toCharArray();
                map[i][j]=Character.valueOf(temp2[0]);
            }
        }

        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }



    }
}
