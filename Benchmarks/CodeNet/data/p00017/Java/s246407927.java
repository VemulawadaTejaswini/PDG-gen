package volume;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		String buf;
		String[] regex = {
				".*that.*",
				".*this.*",
				".*the.*",
		};
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			buf = br.readLine();
			char[] data = buf.toCharArray();
			while(true){
				boolean bool= false;
				buf = String.valueOf(data);
				for(int i = 0 ;i < regex.length;i++){
					if(buf.matches(regex[i])) bool = true;
				}
				if(bool)break;
				for(int i = 0; i <data.length;i++){
					if(Character.isLowerCase(data[i])){
						if(data[i] == 'z'){
							data[i] = 'a';
						}else data[i] ++;
					}
				}
			}
			System.out.println(buf);
			br.close();
		}
}