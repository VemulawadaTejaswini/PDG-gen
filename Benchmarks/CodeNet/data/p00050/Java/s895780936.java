import java.util.*;
public class Main {
	static List<String> henkan(String n){
		List<String> list = new ArrayList<String>();
		String memo="";
		for(int i=0;i<n.length();i++){
			if(n.charAt(i)==' '||n.charAt(i)=='.'){
				if(memo.equals("apple"))memo="peach";
				else if(memo.equals("peach"))memo="apple";
				list.add(memo);
				memo="";
			}else memo+=n.charAt(i);
		}
		return list;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			List<String> input = henkan(in.nextLine());
			for(int i=0;i<input.size()-1;i++)System.out.print(input.get(i)+" ");
			System.out.println(input.get(input.size()-1)+".");	
		}
	}
}