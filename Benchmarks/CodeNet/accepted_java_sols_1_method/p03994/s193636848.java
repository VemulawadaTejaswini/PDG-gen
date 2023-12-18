import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str;
		str = br.readLine();
		int n = Integer.parseInt(br.readLine());
		char[] arr = str.toCharArray();
		for(int i=0;i<str.length();i++){
			if(i!=str.length()-1){
				if(str.charAt(i)!='a' && n>=(26-(str.charAt(i)-'a'))){
					arr[i] = 'a';
					n-=(26-(str.charAt(i)-'a'));
				}
			}else{
				n%=26;
				arr[i] = (char)((int)'a'+(((int)str.charAt(i)-'a'+n)%26));
			}
		}
		System.out.println(String.valueOf(arr));
	}
}