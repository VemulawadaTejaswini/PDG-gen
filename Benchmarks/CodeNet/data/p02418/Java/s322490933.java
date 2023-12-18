import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			String p = br.readLine();
			String c;
			int flg=0;
			for(int i=0; i<s.length(); i++){
				if(i+p.length()<=s.length()){
					c = s.substring(i, p.length()+i);
				} else{
					c = s.substring(i, s.length()) + s.substring(0, p.length()-(s.length()-i));
				}
				if(p.equals(c)){
					flg = 1;
					break;
				}
			}
			if(flg==1) System.out.println("Yes");
			else       System.out.println("No");
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
}