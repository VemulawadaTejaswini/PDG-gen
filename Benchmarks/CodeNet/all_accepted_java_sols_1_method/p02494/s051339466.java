import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> ans = new ArrayList<int[]>();
        while(true){
            int h = sc.nextInt();
            int w = sc.nextInt();
            if (h == 0 && w == 0) {
                break;
            }
            int[] hw = new int[2];
            hw[0] = h;
            hw[1] = w;
            ans.add(hw);
        }
        for (int k = 0; k < ans.size(); k++) {
            int h = ans.get(k)[0];
            int w = ans.get(k)[1];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.print("#");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}