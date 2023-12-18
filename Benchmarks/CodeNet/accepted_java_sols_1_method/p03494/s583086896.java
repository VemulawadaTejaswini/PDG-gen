    public class Main {
      public static void main(String[] args) {
    	java.util.Scanner scanner = new java.util.Scanner(System.in);
    	int n = scanner.nextInt();
    	int[] a = new int[n];
            int mincount = Integer.MAX_VALUE;
    	for (int i = 0; i < n; i++) {
    		a[i] = scanner.nextInt();
    	}
    	
            for (int i = 0; i < n; i++ ) {
                    int count = 0;
                    while(a[i] % 2 == 0) {
                            a[i] = a[i] / 2;
                            count++;
                    }
                    mincount = Math.min(mincount, count);
            }
    	System.out.println(mincount);
      }
    }