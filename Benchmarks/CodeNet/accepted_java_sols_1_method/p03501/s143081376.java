import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);	
      	int n = Integer.parseInt(sc.next());
      	int a = Integer.parseInt(sc.next());
      	int planB = Integer.parseInt(sc.next());
      	int planA = a * n;
      	
      	if (planA == Math.min(planA, planB)) {
        	System.out.println(planA);	
        } else {
          	System.out.println(planB);
        }
    }
}