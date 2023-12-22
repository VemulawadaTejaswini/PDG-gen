import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String [] num=br.readLine().split(" ");
		int A=Integer.parseInt(num[0]);
		int B=Integer.parseInt(num[1]);
		int sum=A+B;
		if(A == B)
		{
			System.out.println(0);
		}
		else if(sum % 2 !=0)
		{
			System.out.println("IMPOSSIBLE");
		}
		else
		{
			int k=sum/2;
			System.out.println(k);
		}
		
	}

}
