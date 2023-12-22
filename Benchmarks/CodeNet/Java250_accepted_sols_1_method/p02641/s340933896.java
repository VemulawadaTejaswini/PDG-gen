
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        String[] p = new String[n];
        for(int i=0;i<n;i++){
            p[i]=scn.next();
        }
        for(int j=0;j<=51;j++){
            int min = x-j;
            int max = x+j;
            String mi = String.valueOf(min);
            String ma = String.valueOf(max);

            if(!Arrays.asList(p).contains(mi)){
                System.out.println(x-j);
                return;
            }
            if(!Arrays.asList(p).contains(ma)){
                System.out.println(x+j);
                return;
            }

        }
        scn.close();

    }

}