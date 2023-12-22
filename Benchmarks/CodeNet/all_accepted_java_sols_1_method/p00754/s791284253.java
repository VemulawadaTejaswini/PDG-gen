import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true){
			String str = in.nextLine();
			if(str.equals(".")) break;
			char ch[] = str.toCharArray();
			boolean check = true;
			for(int i=0; i<str.length(); i++){
				String re = String.valueOf(ch[i]);
				if(re.equals("(")) list.add(1);
				else if(re.equals("[")) list.add(2);
				else if(re.equals(")")){
					if(list.size()==0 || list.get(list.size()-1)!=1){
						check = false;
					}else{
						list.remove(list.size()-1);
					}
				}else if(re.equals("]")){
					if(list.size()==0 || list.get(list.size()-1)!=2){
						check = false;
					}else{
						list.remove(list.size()-1);
					}
				}
				if(!check) break;
			}
			if(check && list.size()==0) System.out.println("yes");
			else System.out.println("no");
			list.clear();
		}
	}
}