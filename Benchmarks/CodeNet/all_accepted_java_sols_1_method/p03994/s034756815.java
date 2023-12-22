import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    char[] arr = scan.next().toCharArray();
    int n = scan.nextInt();

    for(int i = 0; i < arr.length-1; i++) {
      int dummy = 'z'+1-arr[i];
      if(dummy <= n && arr[i]!='a') {
        n -= dummy;
        arr[i] = 'a';
      }
    }
    
    arr[arr.length-1] = (char)(arr[arr.length-1] + (char)(n%26));
    if(arr[arr.length-1]> 'z') arr[arr.length-1] -= (char)26;

    System.out.println(arr);
  }
}
