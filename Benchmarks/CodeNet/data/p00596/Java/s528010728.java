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

                        int[][] num = new int[n][2];
                        int[] count = new int[l];

                        ia = in.readLine().split(" ");
                        for(int i = 0;i < n; ++i){
                                int s = Integer.parseInt(ia[i]);
                                num[i][0] = (int) (Math.floor(s/10)+0.01);
                                num[i][1] = s%10;
                                ++count[num[i][0]];
                                ++count[num[i][1]];
                        }   

                        int c = 0;
                        for(int i = 0;i < l; ++i){
                                if(count[i]%2 == 1){ 
                                        ++c;
                                }   
                        }   
                        if(c != 2 && c != 0){ 
                                System.out.println("No");
                                continue;
                        }

                        boolean[] next = new boolean[n];
                        Arrays.fill(next,true);
                        boolean yet = true;

                        if(c == 2){
                                int[] a = new int[2];
                                int b = 0;
                                for(int i = 0;i < l; ++i){
                                        if(count[i]%2 == 1){
                                                a[b] = i;
                                                ++b;
                                        }
                                }
                                for(int i = 0;i < n; ++i){
                                        if(num[i][0] == a[0] || num[i][1] == a[0] ||
                                           num[i][0] == a[1] || num[i][1] == a[1]){
                                                if(mfs(num,i)){
                                                        System.out.println("Yes");
                                                        yet = false;
                                                        break;
                                                }
                                                next[i] = false;
                                        }
                                }
                        }
                        if(!yet){
                                continue;
                        }
                        for(int i = 0;i < n; ++i){
                                if(next[i] && mfs(num)){
                                        System.out.println("Yes");
                                        yet = false;
                                        break;
                                }
                        }

                }
        }
        static boolean mfs(int[][] num){
                return mfs(num,9);
        }
        static boolean mfs(int[][] num, int x){
                boolean[] yet = new boolean[num.length];
                Arrays.fill(yet,true);
                int s,e;
                if(x == 9){
                        s = 0;
                        e = num.length;
                } else {
                        s = x;
                        e = x+1;
                }
                for(int i = s;i < e; ++i){
                        if(mfw(num,yet,i,num[i][0])){
                                return true;
                        }
                        if(mfw(num,yet,i,num[i][1])){
                                return true;
                        }
                }
                return false;
        }

        static boolean mfw(int[][] num, boolean[] yet, int n, int s){
                yet[n] = false;
                if(!chk(yet)){
                        return true;
                }
                for(int i = 0;i < num.length; ++i){
                        if(yet[i]){
                                if(num[i][0] == s){
                                        if(mfw(num,yet,i,num[i][1])){
                                                return true;
                                        }
                                }
                                if(num[i][1] == s){
                                        if(mfw(num,yet,i,num[i][0])){
                                                return true;
                                        }
                                }
                        }
                }
                yet[n] = true;
                return false;
        }
        static boolean chk(boolean[] p){
                for(int i = 0;i < p.length; ++i){
                        if(p[i]){
                                return true;
                        }
                }
                return false;
        }
}