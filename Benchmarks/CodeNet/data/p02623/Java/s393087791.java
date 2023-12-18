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
      	int[] str1Array = strArrayToIntList(str1);
      	String str2 = sc.nextLine();
      	int[] str2Array = strArrayToIntList(str2);

		int[] conArray = new int[str1Array.length + str2Array.length];
		System.arraycopy(str1Array, 0, conArray, 0, str1Array.length);
		System.arraycopy(str2Array, 0, conArray, str1Array.length, str2Array.length);
      	Arrays.sort(conArray);
		
      	int sumTime = 0;
      	int count = 0;
        for(int i=0; i<conArray.length; i++){
          if(sumTime + conArray[i] <= k) {
            count++;
            sumTime += conArray[i];
          } else {
            break;
          }
        }
      	System.out.println(count);
    }

  	private static int[] strArrayToIntList(String str) {
      String[] strArray = str.split(" ");
      int[] intList = new int[strArray.length];
      for (int i=0; i<strArray.length; i++) {
        intList[i] = Integer.parseInt(strArray[i]);
      }
      return intList;
    }
}