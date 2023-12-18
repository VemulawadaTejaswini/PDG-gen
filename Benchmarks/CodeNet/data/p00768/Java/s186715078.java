import java.awt.Point;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
     
    static int M, T, P, R;
    static int[] m, t, p, j;
	
    static void start()
    {
    	int[] ans = new int[T];
        int[] times = new int[T];
        
        
        for(int team = 0;team < T;team++)
        {
        	ans[team] = times[team] = 0;
        	for(int pro = 0;pro < P;pro++)
        	{
        		int sum = 0;
        		for(int i = 0;i < R;i++)
        		{
        			if(t[i] == (team+1) && p[i] == (pro+1))
        			{
        				if(j[i] == 0)
        				{
        					ans[team]++;
        					times[team] += sum + m[i];
        					break;
        				}
        				else
        				{
        					sum += 20;
        				}
        			}
        		}
        	}
        }
        
        int[] order = new int[T];
        for (int i = 0; i < T; i++) {
			order[i] = i+1;
		}
        
        // ひっくり返す
        int[] anss = ans;
        int[] timess = times;
        int[] orderr = order;
        
        ans = new int[T];
        times = new int[T];
        order = new int[T];
        
        for (int i = 0; i < T; i++) {
			ans[i] = anss[T-1-i];
			times[i] = timess[T-1-i];
			order[i] = orderr[T-1-i];
		}
        
        for (int i = T; i > 0; i--) {
			for (int k = 0; k < (i - 1); k++) {
				if ( (ans[k] < ans[k + 1]) || (ans[k] == ans[k + 1] && times[k] > times[k + 1])) {
					int tmp;
					tmp = ans[k];      ans[k] = ans[k+1];    ans[k+1] = tmp;
					tmp = times[k];      times[k] = times[k+1];    times[k+1] = tmp;
					tmp = order[k];      order[k] = order[k+1];    order[k+1] = tmp;
				}
			}
		}
        
        System.out.print(order[0]);
        for (int i = 1; i < T; i++) {
        	if( (ans[i] == ans[i-1]) && (times[i] == times[i-1]) )
        		System.out.print("=");
        	else
        		System.out.print(",");
        	
        	System.out.print(order[i]);
		}
        System.out.print("\n");
    }
     
    public static void main(String[] args)
    {
         
        Scanner sca = new Scanner(System.in);
        
        while(true)
        {
        	M = sca.nextInt();
            T = sca.nextInt();
            P = sca.nextInt();
            R = sca.nextInt();
            
            if(M == 0) break;
            
            m = new int[R];
            t = new int[R];
            p = new int[R];
            j = new int[R];
            
            for(int i = 0;i < R;i++)
            {
            	m[i] = sca.nextInt();
            	t[i] = sca.nextInt();
            	p[i] = sca.nextInt();
            	j[i] = sca.nextInt();
            }
            
            start();
        }
        
    }
}