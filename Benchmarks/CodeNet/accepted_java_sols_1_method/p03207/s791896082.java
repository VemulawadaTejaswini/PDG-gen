import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      Integer a[] = new Integer[n];

      
		for(int i=0; i<n ;i++){
          a[i] = sc.nextInt();
        }
      Arrays.sort(a, Comparator.reverseOrder());
            int x = a[0]/2;
      	for(int i=1; i<n ;i++){
          x= x+a[i] ;
        }
      System.out.println(x);
      
    }
}