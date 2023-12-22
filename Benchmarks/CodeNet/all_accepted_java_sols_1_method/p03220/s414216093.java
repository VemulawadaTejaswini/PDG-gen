import java.util.*;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int T = scan.nextInt();
    int A = scan.nextInt();
    
    int arr[] = new int [N];
    
    for(int i = 0 ; i< N  ; i++){
      arr[i] = scan.nextInt();
    }
    
    ArrayList<Double> a = new ArrayList<>();
    
    for(int i = 0 ; i < N ; i++){
      a.add( Math.abs(A-(T - arr[i]*.006))) ; 
    }
    
    System.out.println(a.indexOf(Collections.min(a, null))+1);
    
  }
}
