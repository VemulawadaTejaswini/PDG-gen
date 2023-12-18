import java.util.Scanner;

public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        do{
        	int n = sc.nextInt();
        	int sum = 0;
        	for(int i = 0;i < n;i++){
        		sum += Math.abs(sc.nextInt() - sc.nextInt());
        	}
        	if(sum >= t){
        		System.out.println("OK");
        	}else{
        		System.out.println(t - sum);
        	}
        } while((t = sc.nextInt()) != 0);
    }
}
