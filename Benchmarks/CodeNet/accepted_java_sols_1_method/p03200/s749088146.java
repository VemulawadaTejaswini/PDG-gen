import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        final byte[] buffer = new byte[200001];
        int buflen = 0;
        buflen = in.read(buffer);
        int c=0;
        long s=0;
        for (int i=0; i<buflen; ++i) {
            if (buffer[i]=='B') {
                ++c;
            } else if (buffer[i]=='W') {
                s+=c;
            }
        }
       	System.out.println(s);
    }
}
