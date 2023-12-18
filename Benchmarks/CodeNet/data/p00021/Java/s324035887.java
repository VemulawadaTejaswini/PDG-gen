import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        String[] sp;
        int n;
        double x1, y1, x2, y2, x3, y3, x4, y4;
        while((line = br.readLine()) != null) {
            if(line.equals("")) 
                continue ;
            n = Integer.parseInt(line);
            for(; n>0; n--) {
                sp = (br.readLine()).split(" ");
                x1 = Double.parseDouble(sp[0]);
                y1 = Double.parseDouble(sp[1]);
                x2 = Double.parseDouble(sp[2]);
                y2 = Double.parseDouble(sp[3]);
                x3 = Double.parseDouble(sp[4]);
                y3 = Double.parseDouble(sp[5]);
                x4 = Double.parseDouble(sp[6]);
                y4 = Double.parseDouble(sp[7]);
                if((x1-x2)*(y3-y4) == (x3-x4)*(y1-y2))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
        br.close();
    }
}