import java.io.*;

class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try{
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			line = reader.readLine();
			char[] s = line.toCharArray();
			int count_ABC = 0;

			for(int i = 0; i < n-2; i++){
				if((s[i] == 'A') && (s[i+1] == 'B')){
					if((s[i+2] == 'C') && (s[i+1] == 'B')){
						count_ABC ++;
					}
				}
			}
			System.out.println(count_ABC);
		}catch(IOException e){

			System.out.println(e);
			System.exit(0);

		}catch(NumberFormatException e){

			System.out.println(e);
			System.exit(0);
		}
	}
}