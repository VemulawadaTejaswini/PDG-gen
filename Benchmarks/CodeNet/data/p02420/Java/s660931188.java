import java.io.*;

class Main {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){	
			String ini = br.readLine();
			if(ini.equals("-"))break;
			int m = Integer.parseInt(br.readLine());
			for(int i=0; i<m; i++){
				String str = br.readLine();
				int h =  Integer.parseInt(str);
				ini = ini.substring(h,ini.length()) + ini.substring(0,h);
			}
			System.out.println(ini);
		}
	}
}