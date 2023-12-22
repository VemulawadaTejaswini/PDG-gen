import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toLowerCase();
		int cnt=0;
		while(true){
			String[] str2 = br.readLine().split(" ");
			if(str2[0].equals("END_OF_TEXT")) break;
			for(int i=0; i<str2.length; i++){
				if(str2[i].toLowerCase().equals(str)) cnt++;
			}
		}
		System.out.println(cnt);
	}
}