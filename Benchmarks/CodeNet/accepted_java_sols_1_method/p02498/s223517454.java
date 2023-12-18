import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		String bun=s.nextLine();
		for (int i=0;i<bun.length();i++){
			char mozi=bun.charAt(i);
			if(Character.isLowerCase(mozi)){
				sb.append(Character.toUpperCase(mozi));
			}else if(Character.isUpperCase(mozi)){
				sb.append(Character.toLowerCase(mozi));
			}else{
				sb.append(mozi);
			}
		}
		System.out.println(sb);
	}
}