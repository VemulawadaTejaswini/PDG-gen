import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      
      	String[] result = new String[n];
      	for (int i = 0; i<n; i++) {result[i] = sc.next();}
      
      	int c0 = 0;
      	int c1 = 0;
      	int c2 = 0;
      	int c3 = 0;
      	String ac = "AC";
      	String wa = "WA";
      	String tle = "TLE";
      	String re = "RE";
      	String s;
      	for (int i=0; i<n; i++) {
        	s = result[i];
          	
          	if (s.equals(ac)) {c0++;}
          	else if (s.equals(wa)) {c1++;}
          	else if (s.equals(tle)) {c2++;}
          	else if (s.equals(re)) {c3++;}
        }
      	
      	System.out.println("AC" + " x " + c0);
      	System.out.println("WA" + " x " + c1);
      	System.out.println("TLE" + " x " + c2);
      	System.out.println("RE" + " x " + c3);
    }
}