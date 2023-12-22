import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	int m = input.nextInt();
    	int[] num = new int[n];
    	for(int i = 0 ; i < n ; i++){
    		num[i] = (i+1);
    	}
    	for(int i = 0 ; i < m ; i++){
    		String[] s = input.next().split(",");
    		int a = Integer.parseInt(s[0])-1;
    		int b = Integer.parseInt(s[1])-1;
    		int tmp = num[a];
    		num[a] = num[b];
    		num[b] = tmp;
    	}
    	for(int i = 0 ; i < n ; i++){
    		System.out.println(num[i]);
    	}
    }
}