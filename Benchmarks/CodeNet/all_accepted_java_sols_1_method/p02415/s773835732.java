import java.util.*;
import java.lang.*;

class Main{
	public static void main(String[] args){
		StringBuilder sb= new StringBuilder();
		Scanner sc= new Scanner(System.in);
		String line = sc.nextLine();
		char[] c =line.toCharArray();
		for(int i=0;i<line.length();i++){
			if(c[i]>='A' && c[i]<='Z'){
				sb.append(line.substring(i,i+1).toLowerCase());				
			}else if(c[i]>='a' && c[i]<='z'){
				sb.append(line.substring(i,i+1).toUpperCase());
			}else{
				sb.append(line.substring(i,i+1));
			}
		}
		System.out.println(sb.toString());
	}
}