
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main{

	public static void main(String[] args) {

		try {
			List<String> list = new ArrayList<String>();
			BufferedReader r =
                new BufferedReader(new InputStreamReader(System.in), 1);
			String strInput = r.readLine();
			String[] strcmd;
			int loopmax = Integer.parseInt(strInput);
			int tempIdx;

			for(int i=0;i<loopmax;i++) {
				strInput = r.readLine();
				strcmd = strInput.split(" ");

				if(strcmd[0].equals("insert")) {
					list.add(strcmd[1]);
				}else if(strcmd[0].equals("deleteFirst")) {
					list.remove(list.size()-1);
				}else if(strcmd[0].equals("deleteLast")) {
					list.remove(0);
				}else if(strcmd[0].equals("delete")) {
					tempIdx = list.lastIndexOf(strcmd[1]);
					if(tempIdx>=0){
						list.remove(tempIdx);
					}
				}
			}

			StringBuffer sb = new StringBuffer();
			int listSize = list.size();
			for(int i=listSize-1;i>=0;i--) {
				sb.append(list.get(i)).append(" ");
			}
			String out = sb.toString();
			System.out.println(out.substring(0,out.length()-1));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

