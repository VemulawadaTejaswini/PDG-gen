import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.Character;

public class Main {

	public static void main(String[] args) 
	throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = TempReaderCall.getStdInRead(br);
		
		char[] cdata = data.toCharArray();
		
		for (int i=0; i<cdata.length; i++){
			if (Character.isLowerCase(cdata[i]))
					cdata[i] = Character.toUpperCase(cdata[i]);
			else if (Character.isUpperCase(cdata[i]))
				cdata[i] = Character.toLowerCase(cdata[i]);
		}
		
		System.out.println(new String(cdata));
	}

}

class TempReaderCall{
	
	static ArrayList<String> getStdInReadlines(BufferedReader br, int line) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < line; i++)
			list.add(br.readLine());
		return list;
	}
	
	static String getStdInRead(BufferedReader br) throws IOException {
		return (br.readLine());
	}
	
	
	static int[] splitIntArrayFromString(String st) {
		String[] sts = st.split(" ");
		int[] data = new int[sts.length];
		
		for (int i=0;i<sts.length;i++){
			data[i] = Integer.parseInt(sts[i]);
		}
		
		return data;
	}
}