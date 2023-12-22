import java.util.*;

public class Main{
    public static void main(String[] args) /*throws Exception*/{
    Scanner x = new Scanner(System.in);
    int n = x.nextInt();
    int[] arr =new int[n];
    for(int i = 0;i < n;i++){
	arr[i] = x.nextInt();
    }
    Arrays.sort(arr);
    System.out.println(arr[n-1] - arr[0]);
}
}
