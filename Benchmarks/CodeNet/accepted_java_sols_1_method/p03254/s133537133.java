import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int candy = sc.nextInt();
        int rejoice[] = new int[n];
        int sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
        	rejoice[i] = sc.nextInt();
            if(!(sum + rejoice[i] > Math.pow(10, 9))){
            	sum += rejoice[i];
            }
        }
        Arrays.sort(rejoice);
        if(rejoice[0] > candy){
        	System.out.println("0");
        }else if(sum < candy){
        	System.out.println(n - 1);
    	}else{
        	for(int i = 0; i < n; i++){
            	if(candy >= rejoice[i]){
                	candy -= rejoice[i];
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}