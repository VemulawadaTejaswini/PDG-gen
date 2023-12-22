import java.util.*;
class Main {
  public static void main(String[] args) {
    
    Scanner scan =new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = {111,222,333,444,555,666,777,888,999} ;
    int i = 0 ;
    while(n>arr[i]){
      i++;
    }
    System.out.println(arr[i]);
  }
}
