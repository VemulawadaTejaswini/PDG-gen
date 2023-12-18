import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] count = new int[c.length];
		String st;
		while((st = sc.readLine())!=null){
			st = st.toLowerCase();
			char[] ch = st.toCharArray();
			for(int i = 0;i < c.length;i++){
				for(int k = 0;k < ch.length;k++){
					if(ch[k]==c[i]){
						count[i]++;
					}
				}
			}
		}
		for(int i = 0;i < c.length;i++){
			sb.append(c[i]+" : "+count[i]+"\n");
		}
		System.out.print(sb);
	}
}