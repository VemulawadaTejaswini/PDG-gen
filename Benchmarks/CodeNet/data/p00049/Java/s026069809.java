import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		Map map = new HashMap<String,Integer>(){
			{
			put("A",0);
			put("B",0);
			put("AB",0);
			put("O",0);
			}
		};
		for(int i = 0; i < 14; i++){//while(sc.hasNext()){
			String[] str = sc.next().split(",");
			map.put(str[1], (int)map.get(str[1]) + 1);
		}
		String temp[] = {"A","B","AB","O"};
		for(String key:temp){
			out.println(map.get(key).toString());
		}
		out.flush();

	}
}