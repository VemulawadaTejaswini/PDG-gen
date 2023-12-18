import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int list[] = new int[n];
		for(int i=0; i<n; i++){
			list[i] = sc.nextInt();
		}

		Arrays.sort(list);
		
		int max = list[n-1];
		int sum = 0;
		for(int j=0; j<n-1; j++){
			sum += list[j];
		}

		if(max < sum){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
    }
}