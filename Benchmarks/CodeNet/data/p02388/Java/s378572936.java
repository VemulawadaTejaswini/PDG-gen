import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		try{
			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
			String str;
			if((str = stdReader.readLine()) != null)
			{
				int x = Integer.parseInt(str);
				System.out.println(x*x*x);
			}
			
		}
		catch (Exception e)
		{
			e.getStackTrace();
			System.exit(0);
		}
	}
}