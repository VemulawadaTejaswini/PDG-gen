import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int seisu[] = new int[n];
        
        for(int i=0; i<n; i++){
        	seisu[i] = sc.nextInt();   
        }
        
        for(int i=1; i < seisu[n-1]; i++){
        	if(n == 3){
                if(seisu[0] % i == 0 && seisu[1] % i == 0 && seisu[2] % i == 0){
                	System.out.println(i);
                }
            }else if(seisu[0] % i == 0 && seisu[1] % i == 0){
             	System.out.println(i);   
            }
        }
    }
}
