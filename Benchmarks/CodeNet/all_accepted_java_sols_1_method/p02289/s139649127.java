import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int[] s = new int[2000000];
        int sl = 0;
        final StringBuilder sb = new StringBuilder();
        while(true){
            final String in = br.readLine();
            if(in.charAt(2)=='s'){
                final int val = Integer.parseInt(in.substring(7));
                ++sl;
                int i, j;
                for(i = sl, j = i>>>1; i>1&&s[j]<val; i = j, j >>>= 1){
                    s[i] = s[j];
                }
                s[i] = val;
            }else if(in.charAt(2)=='t'){
                sb.append(s[1]).append('\n');
                final int val = s[sl--];
                int i = 1;
                while(true){
                    int j = i+i;
                    if(j>sl) break;
                    if(j<sl&&s[j]<s[j+1]) j++;
                    if(val>s[j]) break;
                    s[i] = s[j];
                    i = j;
                }
                s[i] = val;
            }else break;
        }
        System.out.print(sb);
    }
}