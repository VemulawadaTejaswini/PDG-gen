import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[],p[],str1,str2="";
		boolean flag=false;
		try {
			s=br.readLine().split("");
			str1=br.readLine();
			p=str1.split("");
			for(int i = 0; i<s.length;i++){
				if(p[0].equals(s[i])){
					int c = i;
					for(int k=0;k<p.length;k++){
						str2+=s[c];
						if(c<s.length-1){
							c++;
						}
						else{
							c=0;
						}
					}
					if(str2.equals(str1)){
						flag=true;
					}
					else{
						str2="";
					}
				}
			}
			if(flag){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		} catch (IOException e) {
			// TODO ????????????????????? catch ????????????
			System.err.println(e);
		}

	}
}