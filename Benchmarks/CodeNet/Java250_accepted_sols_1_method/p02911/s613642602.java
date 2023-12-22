import java.util.*;


public class Main{
	public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] array = new int[n];
        Arrays.fill(array, k-q);

        for(int i = 0; i < q; i++){
            int stack = sc.nextInt();
            array[stack-1] += 1;
        }

        for(int j = 0; j < n; j++){
            if(array[j] < 1){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}