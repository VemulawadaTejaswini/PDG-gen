import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		String stack;
		int i;
		int flag;

		while(true){
			str = sc.nextLine();
			if(".".equals(str)) break;

			i = 0;
			flag = 0;
			stack = " ";

			for(int j=0; j<str.length(); j++){
				if(str.charAt(j) == '['){
					stack += "[";
					i++;
				}else if(str.charAt(j) == '('){
					stack += "(";
					i++;
				}else if(str.charAt(j) == ']'){
					if(!stack.endsWith("[")){
						flag = 1;
						break;
					}else{
						stack = stack.substring(0, i);
						i--;
					}
				}else if(str.charAt(j) == ')'){
					if(!stack.endsWith("(")){
						flag = 1;
						break;
					}else{
						stack = stack.substring(0, i);
						i--;
					}
				}
			}

			if(flag==0){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}
}