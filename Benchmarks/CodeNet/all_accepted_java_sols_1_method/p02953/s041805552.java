import java.util.Scanner;
public class Main{
 
	public static void main(String[] args) {
      int max = 0;
      int a = 0;
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
      for(int i = 0;i<=n;i++){
        if(i==n){
          System.out.println("Yes");
          break;
        }
        
        a=sc.nextInt();
        if(max<a)
          max=a-1;
        else if(max==a)
          max=a;
        else{
          System.out.println("No");
          break;
        }
      }
 
      
      
 
 
 
		
		
	}
 
}