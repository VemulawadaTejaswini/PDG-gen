import java.io.*;
import java.util.*;
import java.math.*;
public class Main{
        public static void main(String[] arg) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String[] ia;

                while(true){
                        ia = in.readLine().split(" ");
                        H = Integer.parseInt(ia[0]);
                        W = Integer.parseInt(ia[1]);
                        if(H == 0 && W == 0){
                                break;
                        }
                        prob1 = new char[H][W];
                        prob2 = new char[W][H];
                        for(int i = 0;i < H; ++i){
                                prob1[i] = in.readLine().toCharArray();
                        }
                        n = Integer.parseInt(in.readLine());
                        cont = new char[n];
                        ia = in.readLine().split(" ");
                        on = 0;
                        for(int i = 0;i < n; ++i){
                                cont[i] = ia[i].charAt(0);
                                if(cont[i] == '-' || cont[i] == '+' || cont[i] == '*' || cont[i] == '/'){
                                        ++on;
                                }
                        }
                        Arrays.sort(cont);
                        con = new int[n][2];
                        co = new boolean[n];
                        os = new boolean[n];

                        boolean cs = true;

                        int c = 0;
                        for(int i = 0;i < H; ++i){
                                for(int j = 0;j < W; ++j){
                                        if((prob2[j][i] = prob1[i][j]) == '.'){
                                                con[c][0] = i;
                                                con[c][1] = j;
                                                ++c;
                                        }
                                }
                        }

                        if(c != n){
                                cs = false;
                        }
                        osc = 0;
                        for(int i = 0;i < n; ++i){
                                os[i] = sfos(con[i][0],con[i][1]);
                        }
                        if(cs && solv(0)){
                                System.out.println("Yes");
                        } else {
                                System.out.println("No");
                        }
                }
        }
        static int H;
        static int W;
        static char[][] prob1;
        static char[][] prob2;
        static int n;
        static char[] cont;
        static int[][] con;
        static boolean[] co;
        static boolean[] os;
        static int osc;
        static int ss;
        static int on;
        static boolean sfos(int a, int b){
                if(0 < a && a < H){
                        if(!(prob1[a-1][b] == '.' || prob1[a-1][b] == '#' ||
                            (0 <= (prob1[a-1][b] - '0') && (prob1[a-1][b] - '0') < 10))){
                                return false;
                        }
                }

                if(0 <= a && a < H-1){
                        if(!(prob1[a+1][b] == '.' || prob1[a+1][b] == '#' ||
                            (0 <= (prob1[a+1][b] - '0') && (prob1[a+1][b] - '0') < 10))){
                                return false;
                        }
                }
                if(0 < b && b < W){
                        if(!(prob1[a][b-1] == '.' || prob1[a][b-1] == '#' ||
                            (0 <= (prob1[a][b-1] - '0') && (prob1[a][b-1] - '0') < 10))){
                                return false;
                        }
                }
                if(0 <= b && b < W-1){
                        if(!(prob1[a][b+1] == '.' || prob1[a][b+1] == '#' ||
                            (0 <= (prob1[a][b+1] - '0') && (prob1[a][b+1] - '0') < 10))){
                                return false;
                        }
                }
                ++osc;
                return true;
        }
        static boolean solv(int c){
                if(c == on){
                        return solve(c);
                }
                for(int i = 0;i < n; ++i){
                        if(os[i] && !co[i]){
                                co[i] = true;
                                prob1[con[i][0]][con[i][1]] = cont[c];
                                prob2[con[i][1]][con[i][0]] = cont[c];
                                if(solv(c+1)){
                                        return true;
                                }
                                co[i] = false;
                        }
                }
                return false;
        }
        static boolean solve(int c){
                char b = 'n';
                if(c == n){
                        return ca();
                }
                for(int i = 0;i < n; ++i){
                        if(!co[i] && cont[i] != b){
                                b = cont[i];
                                co[i] = true;
                                prob1[con[i][0]][con[i][1]] = cont[c];
                                prob2[con[i][1]][con[i][0]] = cont[c];
                                if(solve(c+1)){
                                        return true;
                                }
                                co[i] = false;
                        }
                }
                return false;
        }
        static boolean ca(){
                for(int i = 0;i < H; ++i){
                        if(!cal(prob1[i])){
                                return false;
                        }
                }
                for(int i = 0;i < W; ++i){
                        if(!cal(prob2[i])){
                                return false;
                        }
                }
                return true;
        }
        static boolean cal(char[] s){
                int b=0,i,j;
                boolean flag = true;
                while(b < s.length){
                        for(i = b;i < s.length; ++i){
                                if(s[i] == '='){
                                        break;
                                }
                        }
                        for(j = b;j < s.length; ++j){
                                if(s[j] == '#'){
                                        break;
                                }
                        }
                        if(j-b > 2){
                                if(i != s.length){
                                        flag = flag && (calc(s,b,i) == calc(s,i+1,j));
                                } else {
                                        return false;
                                }
                        }
                        b = j+1;
                }
                return flag;
        }
        static int calc(char[] s, Integer t, Integer e){
                int x = 0;
                int t1 = 0;
                if(e-t==0){
                        return Integer.MIN_VALUE;
                }
                for(int i = t;t < e; ++t){
                        if(0 < s[t]-'0' && s[t]-'0'<10){
                                t1 = t1*10+s[t]-'0';
                        } else if(s[t] == '+'){
                                return calc(s,i,new Integer(t)) + calc(s,++t,e);
                        } else if(s[t] == '-'){
                                return calc(s,i,new Integer(t)) - calc(s,++t,e);
                        } else if(s[t] == '*'){
                                t1 *= calc(s,++t,e);
                        } else if(s[t] == '/'){
                                try{
                                        t1 /= calc(s,++t,e);
                                } catch(ArithmeticException f){
                                        return Integer.MIN_VALUE;
                                }
                                break;
                        }
                }
                return t1;
        }
}