import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    char temp;
    int w=0, r=0, min=100;
    int[] max = new int[n+1];

    List<Character> wr = new ArrayList<>();

    for(int i=0; i<n; i++){
      wr.add(str.charAt(i));
    }

    for(int i=0; i<n+1; i++) {
    	for (int j=0; j<i; j++) {
    		if(wr.get(j) == 'W')
    			w++;
    	}
    	for (int j=i; j<n; j++) {
    		if(wr.get(j) == 'R')
    			r++;
    	}
    	max[i] = Math.max(w, r);
    	w=0;
    	r=0;
    }

    for(int i=0; i<n+1; i++) {
    	if (max[i] < min)
    		min = max[i];
    }
    System.out.println(min);

    sc.close();
  }
}