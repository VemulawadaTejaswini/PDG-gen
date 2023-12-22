import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int hako;
        for(int i = 0; i <= n; i++){
            hako = i;
            if(i % 3 == 0 && i > 0){
                System.out.print(" "+i);
            }else{
            	while(hako != 0){
                	if(hako%10 == 3){
                    	System.out.print(" "+i); break;
                	}else{
                    	hako /= 10;
                	}
                }
            }
        }
        System.out.println();
    }
}
