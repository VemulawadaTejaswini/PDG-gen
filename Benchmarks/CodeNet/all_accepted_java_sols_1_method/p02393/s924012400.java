import java.io.*;
public class Main {
		public static void main(String[] arg) throws IOException {
			InputStreamReader is = new InputStreamReader(System.in); 
	        BufferedReader br = new BufferedReader(is);
			String str = br.readLine();
			String[] spl = str.split(" ");
			int first = 0;
			int second = 1;
			int thrid = 2;
			if(Integer.parseInt(spl[0]) < Integer.parseInt(spl[1])){
				if(Integer.parseInt(spl[1]) < Integer.parseInt(spl[2])){
					System.out.println(spl[0]+" "+spl[1]+" "+spl[2]);
				}else if(Integer.parseInt(spl[0]) < Integer.parseInt(spl[2])){
					System.out.println(spl[0]+" "+spl[2]+" "+spl[1]);
				}else{
					System.out.println(spl[2]+" "+spl[0]+" "+spl[1]);
				}
			}else if(Integer.parseInt(spl[0]) < Integer.parseInt(spl[2])){
				System.out.println(spl[1]+" "+spl[0]+" "+spl[2]);
			}else if(Integer.parseInt(spl[1]) < Integer.parseInt(spl[2])){
				System.out.println(spl[1]+" "+spl[2]+" "+spl[0]);
			}else{
				System.out.println(spl[2]+" "+spl[1]+" "+spl[0]);
			}
	}

}