import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		
		for(int i=0;i<str.length;i++){
			if(str[i].equals("apple")){
				str[i] = "peach";
			}else if(str[i].equals("apple.")){
				str[i] = "peach.";
			}else if(str[i].equals("peach")){
				str[i] = "apple";
			}else if(str[i].equals("peach.")){
				str[i] = "apple.";
			}else if(str[i].equals("Apple")){
				str[i] = "peach";
			}else if(str[i].equals("Apple.")){
				str[i] = "peach.";
			}else if(str[i].equals("Peach")){
				str[i] = "apple";
			}else if(str[i].equals("Peach.")){
				str[i] = "apple.";
			}
		}
		
		String s = "";
		for(int i=0;i<str.length;i++){
			s += str[i]+" ";
		}
		System.out.println(s.trim());
	}
}