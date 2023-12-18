import java.util.HashMap;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int max=0;
		String longest="";
		int maxx=0;
		String most="";

		String[] s=sc.nextLine().split(" ");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i=0; i<s.length; i++){
			if(map.containsKey(s[i])){
				int c=map.get(s[i]).intValue();
                map.put(s[i],Integer.valueOf(c+1));
			}else{
				map.put(s[i],Integer.valueOf(1));
			}
		}


		for(int i=0; i<s.length; i++){
			if(s[i].length()>max){
				max=s[i].length();
				longest=s[i];
			}
			if(map.get(s[i]).intValue()>maxx){
				maxx=map.get(s[i]).intValue();
				most=s[i];
			}

		}
		System.out.println(most+" "+longest);

	}

}

