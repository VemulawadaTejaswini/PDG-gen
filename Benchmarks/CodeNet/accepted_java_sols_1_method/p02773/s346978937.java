import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n =  sc.nextInt();
	String[] s = new String[n];
	int max = 0;
	int count=0;
	Map<String,Integer> Hash = new HashMap<>();
	ArrayList<String> list = new ArrayList<String>();
	for(int i=0;i<n;i++) {
		s[i] = sc.next();
	}

	 for(String a:s) {
         if(Hash.containsKey(a)) {
        	 count = Hash.get(a)+1;
        	 Hash.replace(a, count);
         }
         else {
        	 Hash.put(a, 1);
         }
	 }

	 for(String b:Hash.keySet()) {
		 max = Math.max(Hash.get(b),max);
	 }

	 for(String c:Hash.keySet()) {
		 if(Hash.get(c)==max) {
			 list.add(c);
		 }
	 }
	 Collections.sort(list);
	 for(int i=0;i<list.size();i++) {
	 System.out.println(list.get(i));
	 }
  }
}