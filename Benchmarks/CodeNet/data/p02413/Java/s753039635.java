import java.io.*;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
????????????StringBuilder sb = new StringBuilder();       
        String[] str = br.readLine().split(" ");
        int r = Integer.parseInt(str[0]);
        int c = Integer.parseInt(str[1]);
        int g, p, gg = 0;
        String strs;
        int[] sum = new int[c];
        for (int i =0; i < r; i++) {
            strs = br.readLine();
            str = strs.split();
            g = 0;
            for (int j = 0; j < c; j++) {
                p = Integer.parseInt(str[j]);
                g += p;
                sum[j] += p; 
            }
??????????????????gg +=g;
            
        }
    }
}