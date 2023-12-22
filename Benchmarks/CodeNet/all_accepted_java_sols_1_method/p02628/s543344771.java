import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	int[] num = new int[n];
		for(int i=0;i<n;i++){
          num[i] = sc.nextInt();
        }
      	Arrays.sort(num);
      	int sum = 0;
      	for(int i=0;i<k;i++){
          sum += num[i];
        }
      	System.out.println(sum);
	}
}