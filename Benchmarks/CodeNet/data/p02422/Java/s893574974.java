import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    
    	String str = br.readLine();
    	int q = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < q; i++)
    	{
    		String[] order = br.readLine().split(" ");
    		int a = Integer.parseInt(order[1]);
    		int b = Integer.parseInt(order[2]);
			String cut = str.substring(a, b + 1);
			String hajime = str.substring(0, a);
			String nokori = str.substring(b + 1);
			String newcut = "";
    		
    		if (order[0].equals("print"))
    		{
    			System.out.println(cut);
    		}
    		else if (order[0].equals("reverse"))
    		{
    			for (int j = cut.length() - 1; j >= 0; j--)
    			{
    				newcut += String.valueOf(cut.charAt(j));
    			}
    			str = hajime + newcut + nokori;
    			//System.out.println(str); //test
    		}
    		else if (order[0].equals("replace"))
    		{
    			String p = order[3];
    			str = hajime + p + nokori;
    			//System.out.println(str); //test
    		}
    	}
	}

}