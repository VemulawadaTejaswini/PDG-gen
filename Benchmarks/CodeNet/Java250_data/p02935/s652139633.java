
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        ArrayList<Integer> vs = new ArrayList<>();
        
        for (int i = 0; i < n; i ++) {
            vs.add(s.nextInt());
        }
        
        Collections.sort(vs);
        
        double output = vs.get(0);
        
        for (int i = 1; i < vs.size(); i ++) {
            output = (double) (output + vs.get(i)) / 2;
        }
        
        
        System.out.println(output);
        
    }
    
}
