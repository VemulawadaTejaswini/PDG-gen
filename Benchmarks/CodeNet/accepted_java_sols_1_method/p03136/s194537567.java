import java.io.*;
import java.math.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	//List<Integer> l = new ArrayList<Integer>();
      	int max = 0;
      	int tsum = 0;
      	while(n > 0) {
        	int ele = sc.nextInt();
          	//l.add(ele);
          	n--;
          	max = max > ele ? max : ele;
          	tsum += ele;
        }
	    System.out.println((tsum - max) > max ? "Yes" : "No");
    }
}