import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int q = Integer.parseInt(br.readLine());
		for(int i =0; i<q; i++){
			String[] input = br.readLine().split(" ");
			if(input[0].equals("replace")){
				char[] c = str.toCharArray();
				String rep = input[3];
				int index = 0;
				for(int k=Integer.parseInt(input[1]); k<=Integer.parseInt(input[2]); k++){
					c[k] = rep.charAt(index);
					index++;
				}
				str = String.valueOf(c);
			}else if(input[0].equals("print")){
				System.out.println(str.substring(Integer.parseInt(input[1]),Integer.parseInt(input[2]) + 1));
			}else{
				char[] c = str.toCharArray();
				char[] cc = str.toCharArray();
				int index = Integer.parseInt(input[2]);
				for(int k=Integer.parseInt(input[1]); k<=Integer.parseInt(input[2]); k++){
					c[k] = cc[index];
					index--;
				}
				str = String.valueOf(c);
			}
		}

	}
}