import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
    	Main app=new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        app.move(n);
        
       
    }
    void move(int  n){
    	 while(true) {
    		 if(n==0) break;
             long temp=1;
             int count=0;
             for(int i=n; i>1; i--) {
                 temp *= i;
                 if(temp > 1000000000) temp %= 1000000000;
                 while(temp%10 == 0) {
                     count++;
                     temp /= 10;
                 }
             }
             System.out.println(count);
         }
    	
    }
}