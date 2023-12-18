import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int A = Integer.parseInt(line[1]);
        int B = Integer.parseInt(line[2]);
        int max = A+B;
        
        String[] student = br.readLine().split("");
        int passed = 0,
            foreign = 0;
        for(int i=0;i<N;i++){
        	if(passed >= max) System.out.println("No");
        	else{
        		if(student[i].equals("a")) {
        			System.out.println("Yes");
        			passed++;
        		}
        		else if(student[i].equals("b")){
        			if(foreign < B){
        				System.out.println("Yes");
        				passed++;
        				foreign++;
        			}
        			else System.out.println("No");
        		}
        		else System.out.println("No");
        	}
        }
        
        
    }
}
