import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author imkat
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	throws IOException{
		// TODO Auto-generated method stub
		ArrayList<String> al = (new StandardIn()).getlines(2);
		String p,s;
		p = al.get(0);
		s = al.get(1);
		
		System.out.println((compareLikeRing(p,s)?"Yes":"No"));
		
	}
	
	static boolean compareLikeRing(String p, String s){
		boolean flag = false;
		for (int i=0; i<p.length();i++){
			boolean check = (0==s.compareTo(substringLikeRing(p,i,s.length())));
			flag = (check||flag);
		}
		return flag;
	}

	static String substringLikeRing(String p, int pos, int length){
		char buf[] = new char[length];
		int count = length;
		while(count > 0){
			buf[length-count]=p.charAt(pos);
			pos++;
			count--;
			if (pos>=p.length()) pos=0;
		}
		return (String.valueOf(buf));
		
	}
}

class TempReaderCall{
	
	static int[] splitIntArrayFromString(String st) {
		String[] sts = st.split(" ");
		int[] data = new int[sts.length];
		
		for (int i=0;i<sts.length;i++){
			data[i] = Integer.parseInt(sts[i]);
		}
		
		return data;
	}
}

class StandardIn{
	private BufferedReader br;
	
	StandardIn(){
		br = new BufferedReader (new InputStreamReader(System.in));
	}
	
	ArrayList<String> getlines(int line) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		if (line==0){
			String tmplinedata;
			while(null != (tmplinedata = br.readLine())){
				list.add(tmplinedata);
			}
		}
		else {
			for (int i = 0; i < line; i++)
				list.add(br.readLine());
		}
		return list;
	}
	
	ArrayList<String> getlines(String end) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		String newdata;
		do{
			newdata =br.readLine();
			if (end.compareTo(newdata)==0)
				break;
			list.add(newdata);
		}while(newdata!=null);
		
		return list;
	}
	
	String getaline() throws IOException {
		return (br.readLine());
	}
}