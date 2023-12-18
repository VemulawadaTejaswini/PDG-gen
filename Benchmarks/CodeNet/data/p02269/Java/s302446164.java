import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
public class Main{
	static HashSet<String> list = new HashSet<String>();
	//ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[2];
        //Iterator it = set.iterator();
		while(0!=n--){
			str=br.readLine().split(" ");
			if(str[0].equals("insert")){
				insert(str[1]);
			}
			else
				find(str[1]);
		}
	}
	public static void insert(String str){
		list.add(str);
	}
	public static void find(Object str){
		if(list.contains(str))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}