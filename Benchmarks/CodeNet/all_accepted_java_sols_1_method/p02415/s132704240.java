import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] cr = str.toCharArray();
		for(int i=0;i<cr.length;i++){
			if(Character.isLowerCase(cr[i])){
				System.out.print(Character.toUpperCase(cr[i]));
			}else{
				System.out.print(Character.toLowerCase(cr[i]));
			}
		}
		System.out.println();
	}
}