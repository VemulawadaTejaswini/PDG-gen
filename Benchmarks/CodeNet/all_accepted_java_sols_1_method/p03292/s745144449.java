import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>() ;
    for(int i = 0 ; i < 3 ; i++){
      arr.add(scan.nextInt());
    }
 
    System.out.println(Collections.max(arr,null) -Collections.min(arr, null));
    
  }
}
