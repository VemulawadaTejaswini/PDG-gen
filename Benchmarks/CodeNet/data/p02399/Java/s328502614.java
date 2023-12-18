import java.util.*;

//divisor Number
public class Main {
	public static void main(String args[])
	{
		String[] str = new String[2];
		long [] output = new long [2];
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine().split(" ");
		output[0] = Integer.parseInt(str[0]);
		output[1] = Integer.parseInt(str[1]);
		
		long d = output[0]/output[1];
		long r = output[0]%output[1];
		double f = (double)output[0]/(double)output[1];
		System.out.println(d + " " + r + " " + f);
		sc.close();

	}
}

