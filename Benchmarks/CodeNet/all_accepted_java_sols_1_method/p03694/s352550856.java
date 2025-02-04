import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int number = Integer.parseInt(line);
        String[] in = br.readLine().split(" ");
        ArrayList<Integer> coordinate = new ArrayList<Integer>(); 
        int max = 0;
        int min = 1000;
        
        for(int i = 0; i < in.length; i++) {
            coordinate.add(Integer.parseInt(in[i]));
        }
        for(int j = 0; j < coordinate.size(); j++) {
            if(min > coordinate.get(j)) {
                min = coordinate.get(j);
            }
            if(max < coordinate.get(j)) {
                max = coordinate.get(j);
            }
        }
        System.out.println(max - min);
    }
}