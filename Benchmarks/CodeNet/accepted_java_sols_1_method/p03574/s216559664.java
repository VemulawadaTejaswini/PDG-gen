import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] s = new char[h][w];
        
        String tmp = sc.nextLine();
        for(int i = 0; i < h; i++){
            tmp = sc.nextLine();
            for(int j = 0; j < w; j++){
                s[i][j] = tmp.charAt(j);
            }
        }

        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(s[i][j] == '.'){
                    int count = 0;
                    for(int p = Math.max(0,i-1); p <= Math.min(h-1,i+1); p++){
                        for(int q = Math.max(0,j-1); q <= Math.min(w-1, j+1); q++){
                            if(s[p][q] == '#') count++;
                        }
                    }
                    out.print(count);
                }else{
                    out.print('#');
                }
            }
            out.println();
        }

        out.flush();
        sc.close();
    }
}