import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] a = new char[h][w];
        for(int i = 0; i < h; i++){
            a[i] = sc.next().toCharArray();
        }
        
        boolean[] bh = new boolean[h];
        boolean[] bw = new boolean[w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(a[i][j] == '#'){
                    bh[i] = true;
                    bw[j] = true;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < h; i++){
            boolean b = false;
            for(int j = 0; j < w; j++){
                if(bh[i] && bw[j]){
                    sb.append(a[i][j]);
                    b = true;
                }
            }
            if(b) sb.append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}