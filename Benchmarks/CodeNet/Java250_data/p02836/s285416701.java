import java.util.*;
 
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String NString = scanner.nextLine();
        char[] arr = NString.toCharArray();
        int N = arr.length;
        int startIndex = (N/2) - 1;
        int endIndex = (N%2) == 0 ? (int)(N/2) : (int) (Math.ceil((float)N/2)) ;
        int count = 0;

        while(startIndex >= 0 && endIndex <= N - 1){
            if(arr[startIndex] == arr[endIndex]){
                
            }
            else
                count++;
          
            startIndex--;
            endIndex++;
        }

        sb.append(count);
        System.out.println(sb);
    }
}