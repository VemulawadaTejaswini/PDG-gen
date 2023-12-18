import java.io.*;
import java.util.Arrays;
public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String is; 
                String ia[];
                while((is = in.readLine()) != null){
                        int l = 7;
                        int n = Integer.parseInt(is);
                        boolean[][] p = new boolean[l][l];
                        for(int i = 0;i < l; ++i){
                                Arrays.fill(p[i],false);
                        }   
                        ia = in.readLine().split(" ");
                        int[] s = new int[n];
                        int[] tmp = new int[l];
                        for(int i = 0;i < n; ++i){
                                s[i] = Integer.parseInt(ia[i]);
                                int a = (int)(Math.floor(s[i]/10)+0.1);
                                ++tmp[a];
                                int b = s[i]%10;
                                ++tmp[b];
                                p[a][b]= true;
                        }   
                        int c = 0;
                        for(int i = 0;i < l; ++i){
                                if(tmp[i]%2 == 1){ 
                                        ++c;
                                }   
                        }   
                        if(c != 2){ 
                                System.out.println("No");
                                continue;
                        }   
                        boolean yet = true;
                        for(int i = 0;i < n; ++i){
                                if(mfs(p, l, (int)(Math.floor(s[i]/10)+0.1), s[i]%10, 0)){
                                        System.out.println("Yes");
                                        yet = false;
                                        break;
                                }   
                        }   
                        if(yet){
                                System.out.println("No");
                        }   
                }   
        } 
        static boolean mfs(boolean[][] p, int n, int x, int y, int f){ 
                if(x < 0 || n <= x || y < 0 || n <= y){ 
                        return false;
                }
                if(p[x][y] == false){
                        return false;
                }
                p[x][y] = false;
                if(!chk(p,n)){
                        return true;
                }
                if(f != 1){
                        for(int i = 0;i <= y; ++i){
                                if(mfs(p,n,i,y,1)){
                                        return true;
                                }
                        }
                        for(int i = y;i < n; ++i){
                                if(mfs(p,n,y,i,2)){
                                        return true;
                                }
                        }
                }
                if(f != 2){
                        for(int i = 0;i <=x; ++i){
                                if(mfs(p,n,i,x,1)){
                                        return true;
                                }
                        }
                        for(int i = x;i < n; ++i){
                                if(mfs(p,n,x,i,2)){
                                        return true;
                                }
                        }
                }
                p[x][y] = true;
                return false;
        }
        static boolean chk(boolean[][] p, int n){
                for(int i = 0;i < n; ++i){
                        for(int j = 0;j < n; ++j){
                                if(p[i][j]){
                                        return true;
                                }
                        }
                }
                return false;
        }
}