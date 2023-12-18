import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		List list = new ArrayList<Character>();
      	for(int i=0; i<s.length(); i++){
          if(s.charAt(i)!='B') list.add(s.charAt(i));
          else{
          	if(list.size()!=0) list.remove(list.size()-1);
          }
        }
     	for(int i=0;i<list.size();i++) System.out.print(list.get(i));
	}
}