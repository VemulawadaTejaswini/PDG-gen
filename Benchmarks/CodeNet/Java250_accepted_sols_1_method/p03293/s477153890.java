import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
boolean flag = false;
for(int i = 0;i < str1.length();++i){
  String sufStr = str1.substring(str1.length() - i, str1.length());
  String preStr = str1.substring(0, str1.length() - i);
  String compareStr = sufStr + preStr;
  if(compareStr.equals(str2))
    flag = true;
}
if(flag)
  System.out.println("Yes");
else
  System.out.println("No");

}
}