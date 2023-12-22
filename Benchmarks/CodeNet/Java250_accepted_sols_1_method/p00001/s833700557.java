import java.io.*;

class Main {
    public static void main(String[] args) throws java.io.IOException{
        int fst = 0,snd = 0,thi = 0;
        int temp;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10; i++) {
            int j = Integer.parseInt(in.readLine());
            if (j > fst) {
                temp = snd;
                snd = fst;
                thi = temp;
                fst = j;
            } else if (j > snd) {
                thi = snd;
                snd = j;
            } else if (j > thi) {
                thi = j;
            }
        }
        System.out.println(fst);
        System.out.println(snd);
        System.out.println(thi);
    }
}