import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[] dict = new boolean[33554432];
        
        for(int i = 0; i < n; i++) {
            String[] commands = br.readLine().split(" ");
            int key = makeKey(commands[1]);

            if(commands[0].equals("insert")) {
                //System.out.println("insert:" + commands[1] + ":" + key);
                dict[key] = true;
            } else {
                if(dict[key]) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }

    public static int makeKey(String s) {
        int key = 1;
        for(int i = 0; i < s.length(); i++) {
            int c = 0;
            switch(s.charAt(i)) {
            case 'A':
                c = 0;
                break;
            case 'C':
                c = 1;
                break;
            case 'G':
                c = 2;
                break;
            case 'T':
                c = 3;
                break;
            }
            key <<= 2;
            key |= c;
        }
        return key;
    }
}