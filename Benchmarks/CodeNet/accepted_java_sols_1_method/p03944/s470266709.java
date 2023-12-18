import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int x_start=0,x_end=w,y_start=0,y_end=h;

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            if(a==1){
                x_start=Math.max(x,x_start);
            }
            else if(a==2){
                x_end=Math.min(x,x_end);
            }
            else if(a==3){
                y_start=Math.max(y,y_start);
            }
            else if(a==4){
                y_end=Math.min(y,y_end);
            }
        }
        if (x_end<=x_start || y_end<=y_start) {
            System.out.println(0);
        }
        else
            System.out.println((x_end-x_start)*(y_end-y_start));

    }
}
