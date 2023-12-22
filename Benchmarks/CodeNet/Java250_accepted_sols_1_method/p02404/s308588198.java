import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] lines = br.readLine().split(" ");
            int h = Integer.parseInt(lines[0]);
            int w = Integer.parseInt(lines[1]);
            if (h == 0 && w == 0) {
                break;
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if(i==0||i==h-1||j==0||j==w-1){
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}