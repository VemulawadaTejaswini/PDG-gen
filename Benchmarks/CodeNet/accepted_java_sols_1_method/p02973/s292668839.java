import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int[] colors = new int[n];
        Arrays.fill(colors,-1);
        int idex =0;
        int next;int cur=0;
        for(int i=0;i<n;i++){
            cur = in.nextInt();
            int l=0;int r= idex;
            while (l!=r){
                next = (int)Math.floor((l+r)/2);
                if (colors[next]<cur)r=next;
                else l=next+1;
            }
            if (colors[r]<cur) colors[r]=cur;
            else {
                idex++;
                colors[idex]=cur;
            }
        }
        System.out.println(idex+1);

    }
}
