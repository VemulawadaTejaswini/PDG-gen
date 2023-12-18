import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int N = sc.nextInt();


    	ArrayList<String> result = new ArrayList<>();
    	result.add(sc.next());
//    	for(int i=1;i<N;i++) {
//    		System.out.println(i);
//    		String next = sc.next();
//    		boolean chk = true;
//    		for(String j:result) {
//    			if(next.equals(j)) {
//    				chk = false;
//    				break;
//    			}
//    		}
//    		if(chk) {
//    			result.add(next);
//    			Collections.sort(result);
//    		}
//    	}
    	for(int i=1;i<N;i++) {
    		result.add(sc.next());
    	}
//		Collections.sort(result);
		ArrayList<String> ans = new ArrayList<String>(new HashSet<>(result));
    	System.out.println(ans.size());
    }

}