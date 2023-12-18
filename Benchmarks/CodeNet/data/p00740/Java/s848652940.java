import java.io.*;
import java.util.*;

class Main {
    void run() throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String num = in.readLine();
            String[] tmp = num.split(" ", 0);
            int player = Integer.parseInt(tmp[0]);
            int stone = Integer.parseInt(tmp[1]);
            if(player == 0 && stone == 0) {
                break;
            }
            int[] plist = new int[player];
            int ans = stone;
            for(int i = 0;; i++) {

                if(i == player) {
                    i = 0;
                }
               
                if(stone != 0) {
                    plist[i] += 1;
                    stone -= 1;
                    if(plist[i] == ans) {
                        System.out.println(i);
                        break;
                    }
                }
                else if(plist[i]!=0){
                    stone += plist[i];
                    plist[i] = 0;
                }
            
            }
        }
    }
    public static void main(String[] args) throws IOException{
        Main ma = new Main();
        ma.run();
    }
}