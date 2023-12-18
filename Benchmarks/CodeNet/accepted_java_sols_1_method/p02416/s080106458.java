
import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
for(;;){
int ans =0;
String s=sc.nextLine();
if(s.equals("0"))break;
for(int i=0; i<s.length(); i++){
	ans += Character.digit(s.charAt(i),10);
}
System.out.println(ans);
	}
}
}