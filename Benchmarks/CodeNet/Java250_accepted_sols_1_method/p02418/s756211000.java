import java.util.*;

class Main{
	public static void main(String[] args){
		
		int top=0;
		boolean flag = false;
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s = s1+s1;
		String p = sc.nextLine();		
		for(int i=0;i<s1.length();i++){
			if(p.equals(s.substring(top,top+p.length()))){
				flag = true;
				break;
			}
			top++;
		}
		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}