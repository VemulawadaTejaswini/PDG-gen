import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int B = (int)Math.pow(N, 0.5)+1;
    	LinkedHashMap<Integer, Integer> ans = new LinkedHashMap<Integer,Integer>();
    	for(int x=1;x<=B;x++) {
    		for(int y=1;y<=B;y++) {
    			for(int z=1;z<=B;z++) {
    				int n = x*x+y*y+z*z+x*y+y*z+z*x;
    				if(ans.containsKey(n)) {
    					ans.put(n,ans.get(n)+1);
    				} else {
    					ans.put(n,1);
    				}
    			}
    		}
    	}
    	for(int i=1;i<=N;i++) {
    		if(ans.containsKey(i)) {
        		System.out.println(ans.get(i));
    		} else {
    			System.out.println(0);
    		}

    	}

    }
}
