import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        while (true)
        {
        	String mojiretu = br.readLine();
        	if (mojiretu.equals("-"))
        		break;
        	int kaisu = Integer.parseInt(br.readLine());
        	for (int i = 0; i < kaisu; i++)
        	{
        		int shaffle = Integer.parseInt(br.readLine());
        		String cut = mojiretu.substring(0, shaffle);
        		String nokori = mojiretu.substring(shaffle);
        		mojiretu = nokori + cut;
        	}
        	System.out.println(mojiretu);
        }
	}

}