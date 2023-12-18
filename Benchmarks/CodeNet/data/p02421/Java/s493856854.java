import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class Main {
	public static final int TARO=0;
	public static final int HANAKO=1;
	public void exec() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        int[] point = new int[2];
        for(int i=0; i<n; i++) {
        	String[] cards = br.readLine().split(" ");
        	int cmp = cards[TARO].compareTo(cards[HANAKO]);
        	if (cmp < 0){
        		point[HANAKO] += 3;
        	} else if (0 < cmp) {
        		point[TARO] += 3;
        	} else {
        		point[TARO] ++;
        		point[HANAKO] ++;
        	}
        }
        out.printf("%d %d\n",point[TARO], point[HANAKO]);
        out.flush();
    }
  
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
}