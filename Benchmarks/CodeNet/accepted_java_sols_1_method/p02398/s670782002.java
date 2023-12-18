import java.io.*;

class Main{
	public static void main(String[] args) {

		InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);
        try{
	        String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);	
			int count = 0;

			for (;a <= b; a++ ) {
				if (0 == c % a) {
					count++;
				}
			}

			System.out.println(count);
			
		}	
		catch(IOException e) {
            e.printStackTrace();
        }
	}
}