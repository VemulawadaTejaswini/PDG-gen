import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      String k = in.next();
      int ans = 0;
      char[] arr = k.toCharArray(); int countW = 0; int countR = 0;
    //   for(int i = 0 ; i < n ; i++) if(arr[i] == 'W') countW++; else countR++;
      int left = 0 ; int right = n - 1;
      while(left < right){
          while(left < right && arr[left] != 'W') left++;
          while(left < right && arr[right] != 'R') right--;
          if(arr[left] == 'W' && arr[right] == 'R'){
          char temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
          ans++;}
          left++; right--;
      }
    //   if(countW == 0 || countR == 0) System.out.println(0);
      System.out.println(ans);
      
    }
}