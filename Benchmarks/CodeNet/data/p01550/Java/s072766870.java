import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
    
public class Main {
    public static void main(String[] args) throws IOException {
        (new Main()).execute();
    }
    private BigInteger sum = new BigInteger("0");
    private void execute() {
        Scanner sc = new Scanner(System.in);
        summary(new StringBuilder(), getArray(sc), new HashSet<String>());
        System.out.println(sum.divideAndRemainder(new BigInteger("1000000007"))[1]);
        sc.close();
    }
    
    private void summary(StringBuilder sb, String[] arr, Set<String> usedSet) {
    	if(usedSet.size() == arr.length) {return;}
    	for(int i = 0 ; i < arr.length ; i++) {
    		if(usedSet.isEmpty() && "0".equals(arr[i])){continue;}

    		if(!usedSet.contains(arr[i])) {
    			usedSet.add(arr[i]);
    			sb.append(arr[i]);
    			sum = sum.add(new BigInteger(sb.toString()));
    			summary(sb, arr, usedSet);
    			sb.delete(sb.length() - arr[i].length(), sb.length());
    			usedSet.remove(arr[i]);
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