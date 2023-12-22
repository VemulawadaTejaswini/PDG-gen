import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] div = str.split(" ");
		int a = Integer.parseInt(div[0]);
		int b = Integer.parseInt(div[1]);
		int c = Integer.parseInt(div[2]);
		int num[] = new int[3];
		int x = 0;
		int y = 0;
		int z = 0;

		if (a > b){
			x++;
		} else {
			y++;
		}
		
		if (b > c){
			y++;
		} else {
			z++;
		}
		
		if (c > a){
			z++;
		} else {
			x++;
		}
		
		if (a == b && b == c){
			x++;
			z--;
		}
		
		num[x] = a;
		num[y] = b;
		num[z] = c;
		System.out.println(num[0] + " " + num[1] + " " + num[2]);

	}
}