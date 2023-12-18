import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String[] ary = new String[n];
    	List<String> ans = new ArrayList<String>();
    	for(int i = 0; i < n; i++){
    		String s = sc.next();
    		ary[i] = s;
    	}
    	sc.close();
    	Arrays.sort(ary);
    	Set<String> set = new HashSet<String>(Arrays.asList(ary));
    	if(ary.length == set.size()){
    		for(int i = 0; i < ary.length; i++){
        		System.out.println(ary[i]);
        	}
    		return;
    	}
    	int maxcnt = 0;
    	int cnt = 0;
    	ans.add(ary[0]);
    	for(int i = 0; i < n-1; i++){
    		if(ary[i].equals(ary[i+1])){
    			cnt++;
    		}else{
    			cnt = 0;
    		}
    		if(maxcnt == cnt){
    			ans.add(ary[i]);
    		}else if(maxcnt < cnt){
    			maxcnt = cnt;
    			ans.clear();
    			ans.add(ary[i]);
    		}
    	}
    	for(int i = 0; i < ans.size(); i++){
    		System.out.println(ans.get(i));
    	}
    }
}