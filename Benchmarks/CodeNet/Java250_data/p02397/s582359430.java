import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        for(int i = 0; ; ++i) {
            int v[] = new int[2];
            v[0] = ReadInt();
            v[1] = ReadInt();
            if( v[0] == 0 && v[1] == 0 ) break;
            Arrays.sort(v);
            System.out.println(v[0] + " " + v[1]);            
        }
    }
    static int ReadInt() throws IOException {
        return Integer.parseInt(sc.next());
    }
}