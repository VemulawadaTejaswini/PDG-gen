import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    
    	String[] asaikoro = br.readLine().split(" ");
    	String[] bsaikoro = br.readLine().split(" ");
    	
    	int[] as = new int[6];
    	int[] bs = new int[6];
    	int a =  0;
    	
    	for (int i = 0; i < 6; i++)
    	{
    		as[i] = Integer.parseInt(asaikoro[i]);
    		bs[i] = Integer.parseInt(bsaikoro[i]);
    	}
    	
    	if (as[0] == bs[2] || as[0] == bs[3])
    	{
    		a = bs[1];
			bs[1] = bs[2];
			bs[2] = bs[4];
			bs[4] = bs[3];
			bs[3] = a;
    	}
    	
    	for (int i = 0; i < 3; i++) //????????¢????????¢????????£???????????????
		{
			if (as[0] ==bs[0])
				break;
			a = bs[0];
			bs[0] = bs[1];
			bs[1] = bs[5];
			bs[5] = bs[4];
			bs[4] = a;
		}
    	
    	for (int i = 0; i < 3; i++) //?¨??????¢????¨???¢????????£???????????????
		{
			if (as[1] ==bs[1])
				break;
			a = bs[1];
			bs[1] = bs[2];
			bs[2] = bs[4];
			bs[4] = bs[3];
			bs[3] = a;
		}
    	
    	if (as[0] == bs[0] && as[1] == bs[1] && as[2] == bs[2] && as[3] == bs[3] && as[4] == bs[4] && as[5] == bs[5])
    		System.out.println("Yes");
    	else
    		System.out.println("No");
    	
	}
}