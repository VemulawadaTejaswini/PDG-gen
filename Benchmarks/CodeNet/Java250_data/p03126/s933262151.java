import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k[] = new int[n];
        int sum = 0;
        ArrayList<Integer> a = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < n; i++){
        	k[i] = sc.nextInt();
            sum += k[i];
            for(int j= 0; j < k[i]; j++){
            	a.add(sc.nextInt());
            }
        }
        if(n == 1){
        	System.out.println(k[0]);
        }else{
        	for(int i = 1; i < m + 1; i++){
                int counta = 0;
            	for(int j = 0; j < sum; j++){
                	if(i == a.get(j)){
                    	counta++;
                    }
                }
                if(counta == n){
                	count++;
                }
            }
            System.out.println(count);
        }
    }
}