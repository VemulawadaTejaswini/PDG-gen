import java.util.*;

public class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
      	int[] arr = new int[5];
      	for( int i = 0 ; i<3 ; i++ )
        {
          String input = sc.nextLine();
          String inputs[] = input.split(" ");
          int a = Integer.valueOf(inputs[0]);
          int b = Integer.valueOf(inputs[1]);
          arr[a]++;
          arr[b]++;
        }
    	for( int i = 1 ; i<5; i++) 
        {
          	if(arr[i]>=3) {
            	System.out.println("NO");
              	return;
            }
        }
      	System.out.println("YES");
    }
}