import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s = 0;
		while(sc.hasNext()){
			String str = sc.next();
			boolean is = true;
			for(int i = 0; i < str.length()/2; i++){
				char a = str.charAt(i);
				char b = str.charAt(str.length()-1-i);
				if(a != b)is = false;
			}
			if(is)s++;
			System.out.println(s);
	}
}
}