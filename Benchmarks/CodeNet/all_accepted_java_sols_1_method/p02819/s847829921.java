import java.util.Scanner;
public class Main{
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
      
      int ans = 0;
      
      for(int i = x;i>=0;i++)
      {
        for(int j =2;j<=350;j++)
        {
          if(i<j*j){
            ans = i;
            break;
          }
          
          if(i%j==0)
            break;
        }
        
        if(ans!=0)
          break;
      }
      
 
      System.out.println(ans);
 
      
 
 
 
      
      
 
 
 
		
		
	}
 
}