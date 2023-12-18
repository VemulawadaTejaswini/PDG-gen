import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in)
		;
		for(;;){
			String s1 = sc.next();
			String s2 = sc.next();
			if(s2.equals("X"))break;
			String[]s=null;
			if(s1.contains("_")){
				s=s1.split("_");
			}
			else if('a'<=s1.charAt(0)&&s1.charAt(0)<='z'){
				StringBuffer sb=new StringBuffer();
				for(int i=0;i<s1.length();i++){
					if(Character.isUpperCase(s1.charAt(i))){
						sb.append(",");
						sb.append(s1.charAt(i));
					}
					else{
						sb.append(s1.charAt(i));
					}
				}
				
				s=sb.toString().split(",");
			}
			else{
				StringBuffer sb=new StringBuffer();
				sb.append(s1.charAt(0));
				for(int i=1;i<s1.length();i++){
					if(Character.isUpperCase(s1.charAt(i))){
						sb.append(",");
						sb.append(s1.charAt(i));
					}
					else{
						sb.append(s1.charAt(i));
					}
				}
				s=sb.toString().split(",");
			}
			StringBuffer sb=new StringBuffer();
			if(s2.equals("U")){
				for(int i=0;i<s.length;i++){
					for(int j=0;j<s[i].length();j++){
						if(j==0&&Character.isLowerCase(s[i].charAt(j))){
							int add=s[i].charAt(j)-32;
							sb.append((char)add);
						}
						else{
							sb.append(s[i].charAt(j));
						}
					}
					
				}
			}
			else if(s2.equals("L")){
				for(int i=0;i<s.length;i++){
					for(int j=0;j<s[i].length();j++){
						if(i!=0&&j==0&&Character.isLowerCase(s[i].charAt(j))){
							int add=s[i].charAt(j)-32;
							sb.append((char)add);
						}
						else if(i==0&&j==0&&Character.isUpperCase(s[i].charAt(j))){
							int add=s[i].charAt(j)+32;
							sb.append((char)add);
						}
						else{
							sb.append(s[i].charAt(j));
						}
					}
					
				}
				
			}
			else{
				for(int i=0;i<s.length;i++){
					for(int j=0;j<s[i].length();j++){
						if(j==0&&Character.isUpperCase(s[i].charAt(j))){
							int add=s[i].charAt(j)+32;
							sb.append((char)add);
						}
						else{
							sb.append(s[i].charAt(j));
						}
					}
					if(i==s.length-1){
						
					}
					else
					sb.append("_");
				}
				
			}
			System.out.println(sb);
		}
	}

}