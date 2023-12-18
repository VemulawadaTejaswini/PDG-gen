import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String answer="";
		while(sc.hasNext()){
			String str=sc.next();
			if(str.charAt(str.length()-1)==','||str.charAt(str.length()-1)=='.'){
				str=str.substring(0,str.length()-1);
			}
			if(str.length()>=3&&str.length()<=6){
				answer+=str+" ";
			}
		}
		answer=answer.substring(0,answer.length()-1);
		System.out.println(answer);
	}
}