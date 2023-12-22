import java.io.*;

class Main {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String keyword = br.readLine();
		int cnt=0;
		String str;
		while((str = br.readLine()) != null){
			if(str.equals("END_OF_TEXT")){
				break;
			}
			String[] w = str.split(" ");
			for(int i=0; i<w.length; i++){
				if(w[i].equalsIgnoreCase(keyword)){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}