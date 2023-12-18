import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

        int[] a = new int[2];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        int idx = a[0] - 1;
        Integer[] numbers = new Integer[a[0]];
        int i = 0;
        while (sc.hasNext()) {
          numbers[i] = sc.nextInt();
          i++;
        }
        for (int p=i; p<a[0]; p++) {
          numbers[p] = 9999;
        }
		Arrays.sort(numbers);
        int total = 0;
        for (int q=0; q<a[1]; q++) {
          total = total + numbers[q];
        }
        System.out.println(total);        
    }
}