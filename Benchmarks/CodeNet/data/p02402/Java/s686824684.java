import java.lang.Math; // headers MUST be above the first class
import java.util.Scanner;
import java.util.Arrays;
// one class needs to have a main() method
public class Main
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n+1];
    int sum = 0;
    for(int i = 0; i<n; i++){
     	arr[i] = sc.nextInt();
        sum+=arr[i];
    }
    Arrays.sort(arr);
    System.out.println(arr[0]+" "+sum+" "+arr[n-1]);
    
  }
}

