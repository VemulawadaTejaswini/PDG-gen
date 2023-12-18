import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line = null;
		while((line=sc.nextLine())!=null){
			char[] ar = line.toCharArray();
			for(char ch:ar){
				if(ch>='A'&&ch<='Z'){
					System.out.printf("%c",ch+32);
				}else if(ch>='a'&&ch<='z'){
					System.out.printf("%c",ch-32);
				}else{
					System.out.print(ch);
				}
			}
		}
	}
}