import java.io.*;
import java.util.*;

class Main {
    int max = 1000000;
    int[] array = new int[max];
    //int[] sosu = new int[max];
    List<Integer> sosu = new ArrayList<Integer>();
    void sosu() {
        for(int i = 2; i < max; i++) {
            if(array[i] == 0) {
                for(int j = i+1; j < max; j++) {
                    if(j % i == 0) {
                        array[j] = 1;
                    }
                }
            }
        }
        for(int i = 2; i < max; i++) {
            if(array[i] == 0) {
                sosu.add(i);
            }
        }
    }


    void run() throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String num = in.readLine();
        String[] member = num.split(" ", 0);
        int lerge = Integer.parseInt(member[0]);
        int small = Integer.parseInt(member[1]);
        int tmp = 0;
        if(lerge < small){
            tmp = small;
            small = lerge;
            lerge = tmp;
        }
        else if(lerge == small) {
            System.out.println(lerge);
            System.exit(0);
        }
        sosu();
        lerge = lerge % small;

        int ans = 1;

        for(int i = 0; i < (lerge % small)/2;) {
            if(lerge % sosu.get(i) == 0 && small % sosu.get(i) == 0) {
                lerge /= sosu.get(i);
                small /= sosu.get(i);
                ans *= sosu.get(i);
            }
            else {
                i++;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) throws IOException{
        Main ma = new Main();
        ma.run();
    }
}