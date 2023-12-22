import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;


public class Main {
	private static final String df = "deleteFirst";
	private static final String dl = "deleteLast";
	private static final String is = "insert";
	private static final String de = "delete";

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//１行目は命令数
		int n = Integer.valueOf(br.readLine());
		String [] a = new String[2];
		ArrayDeque<Integer> strings = new ArrayDeque<Integer>();

		for(int i=0; i < n; i++){
			a = br.readLine().split("\\s+");
        	if(is.equals(a[0])){
        		//先頭からInsert
        		strings.offerFirst(Integer.parseInt(a[1]));
        	} else if(df.equals(a[0])){
        		strings.pollFirst();
        	} else if(dl.equals(a[0])){
    		    strings.pollLast();
        	} else if(de.equals(a[0])){
        		strings.removeFirstOccurrence(Integer.parseInt(a[1]));
        	}
		}
		System.out.println(strings.toString().replace(",", "").replace("[", "").replace("]", ""));
    }
}

