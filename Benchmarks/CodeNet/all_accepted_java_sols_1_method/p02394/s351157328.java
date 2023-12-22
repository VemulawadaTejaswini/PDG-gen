
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String split[] = line.split(" ", 0);
        int W =Integer.parseInt(split[0]);
        int H =Integer.parseInt(split[1]);
        int x =Integer.parseInt(split[2]);
        int y =Integer.parseInt(split[3]);
        int r =Integer.parseInt(split[4]);
        
        if (0<=x&&x+r<=W&&0<=y&&y+r<=H) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}