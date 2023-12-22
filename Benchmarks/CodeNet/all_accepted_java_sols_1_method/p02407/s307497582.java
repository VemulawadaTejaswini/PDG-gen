import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static final int BIG_NUM  = 2000000000;
    public static final int MOD  = 1000000007;
 
    public static void main(String[] args) {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        try {
            int N = Integer.parseInt(br.readLine());
 
            String array[] = br.readLine().split("\\s+");
 
            System.out.printf("%d",Integer.parseInt(array[array.length-1]));
            for(int i = array.length-2; i >= 0; i--){
                System.out.printf(" %d", Integer.parseInt(array[i]));
            }
            System.out.printf("\n");
 
 
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
