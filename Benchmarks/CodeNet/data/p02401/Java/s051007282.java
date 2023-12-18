import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
	String s[] = new String[3];
	Scanner sc = new Scanner(System.in);
		
	while(sc != null){//入力があったら繰り返し開始
	for(int i = 0; i<s.length; i++){
		s[i] = sc.next();
	}
	
			String a = s[0];
			String op = s[1];
			String b = s[2];
			int anum = Integer.parseInt(a);
			int bnum = Integer.parseInt(b);
			int answer = 0;


			if(op.equals("?")){
				break;
			}
			if(op.equals("+")){
				answer = anum + bnum;
			}
			if(op.equals("-")){
				answer = anum - bnum;
			}
			if(op.equals("*")){
				answer = anum * bnum;
			}
			if(op.equals("/")){
				answer = anum / bnum;
			}
			else

			System.out.println(answer);
			}
	sc.close();
	}
}