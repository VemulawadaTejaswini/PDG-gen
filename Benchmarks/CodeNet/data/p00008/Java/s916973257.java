import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Cal
{
	public int a, b, c, d;
	public int n;
	public int count;
	public int sum;

	public Cal()
	{
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		n = 0;
		count = 0;
		sum = 0;
	}

	public void Show()
	{
		System.out.println(count*4);
	}


	public void Calcurete(int num)
	{
		for(int i = 1; i < 10; i++){
			for(int m = 0; m < 4; m++){
				if(m == 0){
					a = i;
				}
				else if(m == 1){
					b = i;
				}
				else if(m == 2){
					c = i;
				}
				else if(m == 3){
					d = i;
				}
				sum = a + b + c +d;
				Hantei(num, sum);
			}
		}
	}

	public void Hantei(int num, int s)
	{
		if(num == s){
			count++;
		}
	}

}




class Main
{
	public static void main(String[] args)throws IOException
	{
		int num1 = 0;

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

	    String ln ="";
	    while((ln = br.readLine())!= null){
			num1 = Integer.parseInt(ln);
	    	Cal cal = new Cal();
	    	cal.Calcurete(num1);
	    	cal.Show();
	    }


	}
}