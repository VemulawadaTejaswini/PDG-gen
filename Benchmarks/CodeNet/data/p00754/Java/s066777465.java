import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		String stack;
		char temp;
		int i;
		int flag;

		while(true){
			str = sc.nextLine();
			if(".".equals(str)) break;

			i = 0;
			flag = 0;
			stack = " ";

			for(int j=0; j<str.length(); j++){
				temp = str.charAt(j);
				if(temp == '['){
					stack += "[";
					i++;
				}else if(temp == '('){
					stack += "(";
					i++;
				}else if(temp == ']'){
					if(!stack.endsWith("[")){
						flag = 1;
						break;
					}else{
						stack = stack.substring(0, i);
						i--;
					}
				}else if(temp == ')'){
					if(!stack.endsWith("(")){
						flag = 1;
						break;
					}else{
						stack = stack.substring(0, i);
						i--;
					}
				}
			}

			if(flag!=0 || i==0){
				System.out.println("no");
			}else{
				System.out.println("yes");
			}
		}
	}
}