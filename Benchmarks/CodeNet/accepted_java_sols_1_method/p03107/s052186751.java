import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < s.length(); i++){
			list.add(Integer.parseInt(s.substring(i,i+1)));
		}
		int i = 0;
		int ans = 0;
		/*for(int i = 0; i < s.length();i++){
			System.out.print(list.get(i));
		}*/
		while(i < list.size()-1 && ans != s.length()){
			if(list.get(i) != list.get(i+1)){
				ans+=2;
				list.remove(i);
				list.remove(i);
				i = 0;
				//System.out.println(i);
			}else{
				i++;
			}
		}
		System.out.print(ans);
	}
}
