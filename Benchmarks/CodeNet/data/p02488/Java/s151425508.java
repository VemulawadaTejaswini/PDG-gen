import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		char[] linearr;
//		String minstr="";
		char[] min = {'.'};
		boolean f = false;
		int code, _code;
		Pattern pt = Pattern.compile("^[a-z]*$");
		Matcher m;
		try{
			while(null != (line=reader.readLine())){
				linearr = line.toCharArray();
				if(!f){//?????????
					//??±???????????????????????\
					m = pt.matcher(String.valueOf(linearr));
					if(m.find()){
						min = linearr;
						f = !f;
					}
				}else{
					//??±???????????????????????\
					m = pt.matcher(String.valueOf(linearr));
					if(! m.find()){
						continue;
					}
					for(int i=0, l=linearr.length; i<l; i++){
						code = (int)min[i];
						_code = (int)linearr[i];
						if(code > _code){
							//min????????\???
							min = linearr;
							break;
						}else if(code < _code){
							//min??????????????\???
							break;
						}
					}
				}
			}
			System.out.println(String.valueOf(min));
		}catch(IOException e){
			System.out.println(e);
		}
	}
}