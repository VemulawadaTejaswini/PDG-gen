import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] jdg = new boolean[h+1][w+1];
        for(int i = 0;i < h;i++){
            String str = sc.next();
            for(int j = 0;j < w;j++){
                if(str.charAt(j) == '#')
                jdg[i][j] = true;
                jdg[i][w] = jdg[i][w] || jdg[i][j];
                jdg[h][j] = jdg[h][j] || jdg[i][j];
            }
        }

        for(int i = 0;i < h;i++){
            if(jdg[i][w]){
                String str = "";
                for(int j = 0;j<w;j++){
                    if(jdg[h][j])
                    str += (jdg[i][j]?"#":".");
                }
                System.out.println(str);
            }
        }
    }
}