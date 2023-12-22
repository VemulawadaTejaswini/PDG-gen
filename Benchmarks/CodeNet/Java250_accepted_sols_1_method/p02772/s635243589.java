import java.util.*;
public class Main {
	public static void main(String[] args){
      	int Access = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
      	int a;
      	for(int i= 1; i<=n;i++)
        {
         	a = sc.nextInt();          	
          	if (a%2!=1)
            {
              if(a%3==0||a%5==0)
              {     
                Access=Access;
              }
              else
              {
                Access=Access+1;
              }
            }
          	else
            {
              Access=Access;
            }
        }	
      	if(Access==0)
        {
          System.out.println("APPROVED");
        }
      	else
        {
          System.out.println("DENIED");
        }
	}
}