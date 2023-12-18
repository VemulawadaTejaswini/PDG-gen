import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
    
public class Main {
    public static void main(String[] args) throws IOException {
        (new Main()).execute();
    }
    private long sum = 0;
    private void execute() throws IOException {
        Scanner sc = new Scanner(System.in);
        summary(new StringBuilder(), getArray(sc), new HashSet<Integer>());
        System.out.println(sum);
        sc.close();
    }
    
    private void summary(StringBuilder sb, String[] arr, Set<Integer> usedSet) {
    	if(usedSet.size() == arr.length) {return;}
    	Integer num;
    	for(int i = 0 ; i < arr.length ; i++) {
    		if(usedSet.size() == 0 && "0".equals(arr[i])){continue;}

    		num = Integer.valueOf(i);
    		if(!usedSet.contains(num)) {
    			usedSet.add(num);
    			sb.append(arr[i]);
    			sum += Long.parseLong(sb.toString());
    			summary(sb, arr, usedSet);
    			sb.delete(sb.length() - arr[i].length(), sb.length());
    			usedSet.remove(num);
    		}
    	}
    }

    private String[] getArray(Scanner sc) {
    	String[] result = new String[sc.nextInt()];
    	for(int i = 0 ; i < result.length ; i++) {
    		result[i] = sc.next();
    	}
    	return result;
    }
}