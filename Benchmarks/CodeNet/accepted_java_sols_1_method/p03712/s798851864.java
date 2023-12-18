import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int H = sc.nextInt();
    	int W = sc.nextInt();
    	List<String> list = new ArrayList<>();
    	for (int i = 0; i < H+2; i++) {
    		StringBuilder sb = new StringBuilder();
    		if (i == 0 || i == H+1) {
        		for (int j = 0; j < W+2; j++) {
        			sb.append("#");
        		}
    		} else {
        		for (int j = 0; j < 3; j++) {
        			if (j != 1) {
        				sb.append("#");
        			} else {
        				sb.append(sc.next());
        			}
        		}
    		}
    		list.add(sb.toString());
    	} 
    	StringBuilder sb = new StringBuilder();
    	for (String s : list) {
    		sb.append(s + "\n");
    	}
    	System.out.println(sb);
    }
}