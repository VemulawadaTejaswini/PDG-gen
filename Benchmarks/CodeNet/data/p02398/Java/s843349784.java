import java.io.*;

class Main {
	public static void main(String[] args){
		int a, b, c, x, A;
		String buf;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			buf = br.readLine();
			String[] line = buf.split(" ");
			
			a = Integer.parseInt(line[0]);
			b = Integer.parseInt(line[1]);
			c = Integer.parseInt(line[2]);
			A = 0;
			for(x=a;x<=b;x++){
				if(c % x == 0){
					A = A+1;
				}
			}
			System.out.print(A);
		} catch(Exception e){
		}
		System.out.print("\n");
	}
}