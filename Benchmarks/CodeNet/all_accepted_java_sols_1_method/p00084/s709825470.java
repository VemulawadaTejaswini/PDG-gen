import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(sc.nextLine().split("[ |\\,|\\.]")));

		for(int i=al.size()-1;i>=0;i--){
			int len = al.get(i).length();
			if(len < 3 || 6 < len){
				al.remove(i);
			}
		}

		System.out.println(al.toString().replaceAll("\\[|,|\\]",""));
	}
}