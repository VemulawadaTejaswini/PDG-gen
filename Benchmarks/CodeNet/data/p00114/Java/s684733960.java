import java.io.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while((line = in.readLine()) != null){
			long[] a = new long[3];
			long[] m = new long[3];
			String[] dst = line.split(" ");

			int end = 0;
			for(int i=0; i<3; i++){
				a[i] = Long.parseLong(dst[2*i]);
				m[i] = Long.parseLong(dst[2*i+1]);

				if(a[i] != 0 || m[i] != 0){
					end = 1;
				}
			}

			if(end == 0){
				break;
			}

			long j = countLoop(a[0], m[0]);
			long k = countLoop(a[1], m[1]);
			long l = countLoop(a[2], m[2]);
			System.out.println(lcm(lcm(j, k), l));
		}
	}

	public long countLoop(long a, long m){
		long n = 1;
		long count = 0;
		do{
			count++;
			n = (a * n) % m;
		}while(n != 1);

		return count;
	}

	public long lcm(long n, long m){
		long p = n*m;
		long tmp;
		while(m%n != 0){
			tmp = n;
			n = m%n;
			m = (long)tmp;
		}

		return p / n;
	}
}