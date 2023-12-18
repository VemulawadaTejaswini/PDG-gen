import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { 
	static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) { 

    	int n = scan.nextInt();
    	String str = "";
    	
    	for(int i=0; i<n; i++) {
    		str += scan.nextInt();	//WARNING
    		if (i != n-1) str += " ";
    	}
    	
    	String str2 = "";
    	List<String> list = new ArrayList<String>();
    	for(int i=1; i<n+1; i++) {
    		str2 += i;
    	}
    	list =permutation(list, str2, "");
    	
    	int a = -1;
    	for(int i=0; i<list.size(); i++) {
    		if(list.get(i).equals(str)) {
    			a = i;
    			break;
    		}
    	}
    	if(a != 0) {
    		System.out.println(list.get(a - 1));
    	}
    	System.out.println(list.get(a));
    	if(a != list.size()-1) System.out.println(list.get(a + 1));
    }
	
    public static List<String> permutation(List<String> list, String q, String ans){
    	if(q.length() <= 1) {
    		list.add(str + q);
    	}else {
    		for (int i = 0; i < q.length(); i++) {
    			permutation(list, q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i) + " ");
    		}
    	}
    	return list;
    }    	
}
