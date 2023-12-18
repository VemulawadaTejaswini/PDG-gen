import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	long total = 0;
    	List<Integer> Ai = new ArrayList<>();
    	for (int i = 0; i < N; i++) {
    		int num = sc.nextInt();
    		Ai.add(num);
    		total += num;
    	}
    	long harf = total/2;
    	long harfSum = 0;
    	int harfIndex = 0;
    	for (int i = 0; i < Ai.size(); i++) {
    		harfSum += Ai.get(i);
    		if (harf <= harfSum) {
    			harfIndex = i;
    			break;
    		}
    	}
    	long harfSum2 = 0;
    	for (int i = harfIndex+1; i < Ai.size(); i++) {
    		harfSum2 += Ai.get(i);
    	}
    	long harfSum3 = harfSum - Ai.get(harfIndex);
    	long harfSum4 = harfSum2 + Ai.get(harfIndex);
    	long ans = Math.min(Math.abs(harfSum2 - harfSum),Math.abs(harfSum3 - harfSum4));
    	System.out.println(ans);
    }
}