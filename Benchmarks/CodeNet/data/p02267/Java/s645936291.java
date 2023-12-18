import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
   
public class Main {
     
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
     
    public void exec() throws IOException {
        SimpleInputUtil in = new SimpleInputUtil();
        PrintWriter out = new PrintWriter(System.out);
        out.print(
        	outC(
        		in.readIntArray(new int[in.readInt()]),
        		in.readIntArray(new int[in.readInt()])
        	)
        );
        out.flush();
    }
    
    private int outC(int[] S, int[] T) {
    	int C = 0;
    	HashSet<Integer> setS = new HashSet<>();
    	for(int s : S) {
    		setS.add(s);
    	}
    	for(int t : T) {
    		if(setS.contains(t)) {
    			C++;
    		}
    	}
    	return C;
    }
}
 
class SimpleInputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    public int readInt() throws NumberFormatException, IOException{
        return Integer.parseInt(br.readLine());
    }
     
    public int[] readIntArray(int[] a) throws NumberFormatException, IOException{
        int i=0;
        while(i<a.length) {
            for(String s: br.readLine().split(" ")){
                if(i<a.length) {
                    a[i++] = Integer.parseInt(s);
                }
            }
        }
        return a;
    }
 
     
}