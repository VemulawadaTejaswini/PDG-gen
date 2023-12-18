import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
        int t = sc.nextInt();
        if(t == 0)break;
            
        int n = sc.nextInt();
        int[] s = new int[n];
        int[] f = new int[n];
        int sum = 0;
        for(int i=0; i < n; i++){
        	s[i] = sc.nextInt();
            f[i] = sc.nextInt();
            sum += f[i] - s[i];
        }
        
        if(sum >= t){
            System.out.println("OK");
        }else{
         	System.out.println(t-sum);   
        }
        }
    }
}

