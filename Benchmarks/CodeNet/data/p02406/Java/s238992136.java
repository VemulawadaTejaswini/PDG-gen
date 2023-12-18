import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i = 1,n = sc.nextInt();
        
        while(i <= n){
        	int x = i;
        	
        	if(x % 3 == 0){
        		System.out.print(i + " ");
        	}else{
        		while(x >=1){
        			if(x % 10 == 3){
        				System.out.print(i + " ");
        				break;
        			}
        		x /= 10;
        		}
        	}
        	i++;
        }
        System.out.println("");
        sc.close();
    }
}
