import java.util.*;

public class Main{
public static void main(String[] args)
	{	Scanner sc = new Scanner(System.in);
     	int n = sc.nextInt();
     	int d = sc.nextInt();
     
     	int ans = 0;
     	for(int i=0; i<n; i++)
        {
          int a = sc.nextInt();
          int b = sc.nextInt();
     double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
          if(c<=d)
            ans++;
        }
     	System.out.println(ans);
  
		}
}