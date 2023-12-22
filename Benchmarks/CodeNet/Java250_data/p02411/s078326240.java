
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
	
		try{
			
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String buf = br.readLine();
	
    int m, f, r;
    
    StringTokenizer st = new StringTokenizer(buf, " ");
    m = Integer.parseInt(st.nextToken());
    f = Integer.parseInt(st.nextToken());
    r = Integer.parseInt(st.nextToken());

    while(true) {
        if (m == -1 && f == -1 && r==-1) break;
        else if (m == -1 || f == -1) {
            System.out.println("F");
        }
        else if (m + f >= 80) {
            System.out.println("A");
        }
        else if (m + f < 80 && m + f >= 65) {
            System.out.println("B");
        }
        else if (m + f < 65 && m + f >= 50) {
            System.out.println("C");
        }
        else if (m + f < 50 && m + f >= 30) {
            if (r >= 50) System.out.println("C");
            else System.out.println("D");
        }
        else System.out.println("F");
         
        buf = br.readLine();
        st = new StringTokenizer(buf," ");
        m = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
    }
    
} catch (Exception e) {

	System.out.println("????????????");
	
}
		 }
    }