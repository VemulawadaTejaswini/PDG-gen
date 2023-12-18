import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Node2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        
     
        
        String[] sp = str.split(" ");
        int[] a = new int[sp.length];
        for(int i=0;i<sp.length;i++){
            a[i] = Integer.parseInt(sp[i]);
        }
        
        int fivecount = 2;
        int sevencount = 1;
        
        for(int i=0;i<3;i++){
            if(a[i] == 5){
                fivecount--;
            }
            if(a[i] == 7){
                sevencount--;
            }
        }
        
        if(fivecount == 0 && sevencount == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
