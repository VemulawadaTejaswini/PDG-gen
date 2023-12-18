import java.util.*;
import java.util.stream.Collectors;
 
public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int m = sc.nextInt();
      	int k = sc.nextInt();

      	sc.nextLine();
      	String str1 = sc.nextLine();
      	int[] str1Array = strArrayToIntList1(str1);
      	String str2 = sc.nextLine();
      	int[] str2Array = strArrayToIntList2(str2);

		int h = 0;
      	int j = m;
      	int p = m - 1;
      	int ans = 0;
    	for(int i=0; i<n; i++) {
          if(str1Array[i] > k) {
            break;
          } else {
            h++;
          }
          while(str2Array[p] > k - str1Array[i]) {
            p--;
            j--;
            if(p < 0) {
              break;
            }
          }
          ans = Math.max(0, h+j);
        }
      	System.out.println(ans);
    }

  	private static int[] strArrayToIntList1(String str) {
      String[] strArray = str.split(" ");
      int[] intList = new int[strArray.length];
      int sum = 0;
      for (int i=0; i<strArray.length; i++) {
        sum += Integer.parseInt(strArray[i]);
        intList[i] = sum;
      }
      return intList;
    }
  
  	private static int[] strArrayToIntList2(String str) {
      String[] strArray = str.split(" ");
      int[] intList = new int[strArray.length+1];
      int sum = 0;
      intList[0] = 0;
      for (int i=1; i<strArray.length; i++) {
        sum += Integer.parseInt(strArray[i]);
        intList[i] = sum;
      }
      return intList;
    }
}