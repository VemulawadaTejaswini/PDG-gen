import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String str = br.readLine();
		int count = 0;
		int index = -1;
		while(true){
			index = str.indexOf(" ", index+1);
			count++;
			if(index == -1)break;
		}

		int n = count;
		int zure = -1;
		boolean f = true;
		String c = str.toString();
		String[] star  = new String[n];
		char[] ch  = new char[n];
		for(int i = 0; i < n; i++){
			if(c.indexOf(" ") !=  -1){
				String prestr = c.substring(0, c.indexOf(" "));
				star[i] = prestr.toString();
				c = c.substring(c.indexOf(" ") + 1);
			}
			else{
				star[i] = c.toString();
			}
			//System.out.println(star[i]);
			ch = star[i].toCharArray();
			
			if((seisa(ch, star[i].length())) != -1){
				if(zure == -1){
					zure = seisa(ch, star[i].length());
				}
			}
		}
		for(int i = 0; i < n;i++){
			ch = star[i].toCharArray();
			for(int j = 0; j < star[i].length(); j++){
				if(ch[j] != '.'){
					ch[j] += zure;
					if(ch[j] > 122)
						ch[j] -= 26;
				}
				System.out.print(ch[j]);
			}
			if(i != n-1)
			System.out.print(" ");
		}
		System.out.println();
	}
	static int seisa(char[] prech, int len){
		char[] ch = prech.clone();
		
		if(!(len == 3 || len == 4))return -1;
		
		if(len == 3){
			for(int i = 0; i < 26;i++){
				if(ch[0] == 't' && ch[1] == 'h' && ch[2] == 'e')
					return i;
				for(int j = 0; j < len;j++){
					if(++ch[j] > 122)
						ch[j] -= 26;
				}
			}
		}
		if(len == 4){
			for(int i = 0; i < 26;i++){
				if(ch[0] == 't' && ch[1] == 'h'
					&& ch[2] == 'i' && ch[3] == 's')
					return i;
				for(int j = 0; j < len;j++){
					if(++ch[j] > 122)
						ch[j] -= 26;
				}
			}
		}
		if(len == 4){
			for(int i = 0; i < 26;i++){
				if(ch[0] == 't' && ch[1] == 'h' 
					&& ch[2] == 'a' && ch[3] == 't')
					return i;
				for(int j = 0; j < len;j++){
					if(++ch[j] > 122)
						ch[j] -= 26;
				}
			}
		}

		return -1;
	}
}