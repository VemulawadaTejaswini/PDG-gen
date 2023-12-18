import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int d = Integer.parseInt(sc.next());
      	int choco = Integer.parseInt(sc.next());
      
      	int[] a = new int[n];
      	for (int i = 0; i < n; i++) {
        	a[i] = Integer.parseInt(sc.next());
        }
  
      	for (int i = 0; i < n; i ++) {
          	int add = d % a[i] != 0 ? 1 : 0;
	       	choco += (d/a[i] + add);
        }
        System.out.println(choco);
    }
}