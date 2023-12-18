import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args){
        char[] s = sc.next().toCharArray();
        int n = s.length;
        int[] black = new int[n], white = new int[n]; // black[i]: paint the i-th to be black
        // The i-th tile from the left is painted black if the i-th character of S
        // is 0, and painted white if that character is 1.
        black[0] = s[0]=='1'?1:0; white[0] = s[0]=='0'?1:0;
        for(int i=1;i<n;i++){
            if(s[i]=='0'){
                black[i] = white[i-1];
                white[i] = black[i-1]+1;
            } else{
                white[i] = black[i-1];
                black[i] = white[i-1]+1;
            }
        }
        System.out.println(Math.min(white[n-1],black[n-1]));
    }
}