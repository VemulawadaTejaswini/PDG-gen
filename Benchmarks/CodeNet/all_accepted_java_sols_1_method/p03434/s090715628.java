import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer inte[] = new Integer[n];
    
    for(int i=0; i<n; i++){
      inte[i] = sc.nextInt();
    }
    
    Arrays.sort(inte, Comparator.reverseOrder());
    int Alice = 0;
    int Bob   = 0;
    
    for (int i=0; i<n; i+=2) {
      Alice += inte[i];
    }
    for (int i=1; i<n; i+=2) {
      Bob += inte[i];
    }
    
  	System.out.println(Alice - Bob);
  }
}
