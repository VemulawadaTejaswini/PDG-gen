import java.io.*;
class Main{
    public static void main(String[] args) throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int a = Integer.parseInt(br.readLine());
	int b = Integer.parseInt(br.readLine());
	int c = Integer.parseInt(br.readLine());
	int count = 0;
	for(int i=a;i<=b;i++)
	    if(c%i==0) count++;
	System.out.println(count);
    }
}