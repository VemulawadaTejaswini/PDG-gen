import java.util.*;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    ArrayList<Integer> a = new ArrayList<>();
    for(int i =0 ; i < n ; i++){
      a.add(scan.nextInt());
    }
    int max = a.remove(a.indexOf(Collections.max(a, null))) / 2;
    int sum = max;
    for(int x : a){
      sum+=x;
    }
	System.out.println(sum);
  }
}
