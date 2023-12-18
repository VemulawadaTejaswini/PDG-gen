import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    String xdata = sc.next();
    sc.close();

    for (int i=0; i<n; i++) {
    	StringBuffer x = new StringBuffer(xdata);

    	if (x.substring(i,i+1).equals("1"))
    		x.setCharAt(i, '0');
    	else x.setCharAt(i, '1');

    	int cnt = 0;
    	int f = binToDec(x);
    	while (f != 0) {
    		int p = popCount(x);
    		f = func(f, p);
    		x = decToBin(n, f);
    		cnt ++;
    	}
    	System.out.println(cnt);
    }


  }
  public static int popCount(StringBuffer n) {
	  int pop=0;
	  for (int i=0; i<n.length(); i++) {
		  if (n.substring(i,i+1).equals("1")) pop++;
	  }
	  return pop;
  }

  public static int func(int n, int p) {
	  int f=0;
	  f = n%p;
	  return f;
  }

  public static StringBuffer decToBin (int n, int f) {
	  StringBuffer x = new StringBuffer();
	  for (int i=n; i>=0; i--) {
		  x.append((f%(int)Math.pow(2, i+1))/(int)Math.pow(2, i));
	  }
	  return x;
  }

  public static int binToDec (StringBuffer x) {
	  int f=0;
	  for (int i=0; i<x.length(); i++) {
		  if (x.substring(i,i+1).equals("1"))
			  f += (int)Math.pow(2, x.length()-i-1);
	  }
	  return f;
  }
}