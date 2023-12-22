import java.io.*;
import java.util.*;

class Main{
    void run() throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        int[] menber = new int[num];
        for(int i = 0;i < num;i++){
            menber[i] = Integer.parseInt(in.readLine());
        }
        int count = 0;
        int ans = -2000000000;
        int minv = menber[0];
        for(int i = 1;i < num;i++){
            if(ans <= menber[i] - minv)
                ans = menber[i] - minv;
            if(minv >= menber[i])
                minv = menber[i];
        }
        System.out.println(ans);
    }
    public static void main(String[] args) throws IOException{
        Main ma = new Main();
        ma.run();
    }
}