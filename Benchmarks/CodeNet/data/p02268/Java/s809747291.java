import java.util.*;
import java.io.*;

class Main {
    static boolean binary(int key, int[] s) {
        int left = 0;
        int right = s.length;
        int mid = 0;
        int count = 0;
        while( left < right) {
            mid = (left + right)/2;
            if(s[mid] == key) {
            return true;
            }
             if (s[mid] > key) {
                 right = mid;
            } else {
                 left = ++mid;
            }
        }
        return false;
    }
    public static void main(String...args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int sSize = Integer.parseInt(br.readLine());
        String[] sStr = br.readLine().split(" ");
        int[] s = new int[sSize];
        for(int i = 0; i < sSize; i++) {
            s[i] = Integer.parseInt(sStr[i]);
        }

        int tSize = Integer.parseInt(br.readLine());
        String[] tStr = br.readLine().split(" ");

        for(int n = 0; n < tSize; n++) {
            int key = Integer.parseInt(tStr[n]);
            if(binary(key, s)) {
            count++;
            }             
            }
        System.out.println(count);
    }
}
