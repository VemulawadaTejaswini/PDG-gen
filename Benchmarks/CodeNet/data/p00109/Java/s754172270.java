import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i < n ; i++){
			String s = sc.nextLine();
			s = s.substring(0, s.length()-1);
			System.out.println(calc(s));
		}

	}
	static String calc(String s){
		ArrayList<String> list = split("("+s+")");
		int index1 = index1(list);
		while(index1 != -1){
			int index2 = index2(list, index1);
			int indexOfm = indexOf("*", list, index2, index1);
			int indexOfd = indexOf("/", list, index2, index1);
			int indexOf = -1;
			if(indexOfm == -1){
				indexOf = indexOfd;
			}else if(indexOfd == -1){
				indexOf = indexOfm;
			}else{
				indexOf = (indexOfm < indexOfd) ? indexOfm : indexOfd;
			}
			while(indexOf != -1){
				long a,b,c;
				a = Long.parseLong((String)list.get(indexOf-1));
				b = Long.parseLong((String)list.get(indexOf+1));
				if(indexOfd == indexOf){
					c = a/b;
				}else{
					c = a*b;
				}
				list.remove(indexOf+1);
				list.set(indexOf, String.valueOf(c));
				list.remove(indexOf-1);
				index1 -= 2;
				indexOfm = indexOf("*", list, index2, index1);
				indexOfd = indexOf("/", list, index2, index1);
				if(indexOfm == -1){
					indexOf = indexOfd;
				}else if(indexOfd == -1){
					indexOf = indexOfm;
				}else{
					indexOf = (indexOfm < indexOfd) ? indexOfm : indexOfd;
				}
			}
			indexOf = indexOf("+", list, index2, index1);
			while(indexOf != -1){
				long a,b,c;
				a = Long.parseLong((String)list.get(indexOf-1));
				b = Long.parseLong((String)list.get(indexOf+1));
				c = a+b;
				list.remove(indexOf+1);
				list.set(indexOf, String.valueOf(c));
				list.remove(indexOf-1);
				index1 -= 2;
				indexOf = indexOf("+", list, index2, index1);
			}
			indexOf = indexOf("-", list, index2, index1);
			while(indexOf != -1){
				long a,b,c;
				a = Long.parseLong((String)list.get(indexOf-1));
				b = Long.parseLong((String)list.get(indexOf+1));
				c = a-b;
				list.remove(indexOf+1);
				list.set(indexOf, String.valueOf(c));
				list.remove(indexOf-1);
				index1 -= 2;
				indexOf = indexOf("-", list, index2, index1);
			}
			list.remove(index1);
			list.remove(index2);
			index1 = index1(list);
		}
		return (String)list.get(0);
	}
	//)ÌCfbNX
	static int index1(ArrayList<String> list){
		for(int i = 0 ; i < list.size() ; i++){
			if(((String)list.get(i)).equals(")")){
				return i;
			}
		}
		return -1;
	}
	//)ÌèOÌ(ÌCfbNX
	static int index2(ArrayList<String> list, int index1){
		for(int i = index1-1; i >= 0 ; i--){
			if(((String)list.get(i)).equals("(")){
				return i;
			}
		}
		return -1;
	}
	//*,/,+,-ÌCfbNX
	static int indexOf(String s, ArrayList<String> list, int index2, int index1){
		for(int i = index2+1; i < index1; i++){
			if(((String)list.get(i)).equals(s)){
				return i;
			}
		}
		return -1;
	}

	static ArrayList<String> split(String s){
		ArrayList<String> list = new ArrayList<String>();
		while(s.length() > 0){
			if(isInt(s.charAt(0))){
				int i = 0;
				String _s = "";
				while(isInt(s.charAt(i))){
					_s += String.valueOf(s.charAt(i));
					i++;
				}
				list.add(_s);
				if(i == s.length()){
					s = "";
				}else{
					s = s.substring(i, s.length());
				}
			}else{
				list.add(String.valueOf(s.charAt(0)));
				s = s.substring(1, s.length());
			}
		}
		return list;
	}
	static boolean isInt(char c){
		if('0' <= c && c <= '9'){
			return true;
		}else{
			return false;
		}
	}
}