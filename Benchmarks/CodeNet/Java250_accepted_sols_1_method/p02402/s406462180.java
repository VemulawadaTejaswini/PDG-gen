import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buf.readLine());
		String[] str = buf.readLine().split(" ");

		int tmp;
		int max = -1000000;
		int min = 1000000;
		long sum=0;
		for(int i=0; i< str.length; i++){
			tmp = Integer.parseInt(str[i]);
			if(tmp <= min)
				min = tmp;
			if(tmp >= max)
				max = tmp;
			sum += tmp;
		}
		System.out.println(min+" "+max+" "+sum);
	}
}