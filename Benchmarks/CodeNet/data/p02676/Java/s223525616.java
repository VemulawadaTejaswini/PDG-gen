import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import static java.lang.System.in;

class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int K = Integer.parseInt(reader.readLine());
        char[] ar = reader.readLine().toCharArray();
        if(ar.length<=K) System.out.println(new String(ar));
        else{
            String res="";
            for (int i = 0; i <K ; i++) {
                res=res+ar[i]+"";
            }
            res=res+"...";
            System.out.println(res);
        }
    }
}
