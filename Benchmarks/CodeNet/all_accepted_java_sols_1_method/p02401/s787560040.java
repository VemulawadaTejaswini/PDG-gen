import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int answer = 0;
		String s[] = new String[3];
		Scanner sc = new Scanner(System.in);
		
		while(true){//入力があったら繰り返し開始
			for(int i = 0; i<s.length; i++){
				s[i] = sc.next();
			}
			int a = Integer.parseInt(s[0]);
			String op = s[1];
			int b = Integer.parseInt(s[2]);
			if(op.equals("?")){
				break;
			}else if(op.equals("+")){
				answer=a+b;System.out.println(answer);
			}else if(op.equals("-")){
				answer=a-b;System.out.println(answer);
			}else if(op.equals("*")){
				answer=a*b;System.out.println(answer);
			}else if(op.equals("/")){
				answer=a/b;System.out.println(answer);
			}
		}
		sc.close();
	}
}