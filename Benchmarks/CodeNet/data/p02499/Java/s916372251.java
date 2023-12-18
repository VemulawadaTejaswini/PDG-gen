import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int init = (int)('a');
		int end = (int)('z');
		int[] arr = new int[end - init + 1];
		char[] charr;
		int i;
		for(i=0; i<arr.length; i++){
			arr[i] = 0;
		}
		int length = -1;
		int code;
		try{
			while(null != (line=reader.readLine())){
				//line = reader.readLine();
				line = line.toLowerCase();
				//System.out.println(line);
				length = line.length();
				charr = new char[length];
				line.getChars(0, length, charr, 0);
				for(i=0; i<length; i++){
					code = (int)(charr[i]);
					//System.out.println("<"+(code-init)+">");
					if(code - init >= 0){
						arr[code - init] ++;
					}
				}
				for(i=0; i<arr.length; i++){
					System.out.println(((char)(i+init))+" : "+arr[i]);
				}
			}
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
}