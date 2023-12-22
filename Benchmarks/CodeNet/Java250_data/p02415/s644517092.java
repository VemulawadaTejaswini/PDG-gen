import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s=sc.nextLine();
for(int i=0; i<s.length(); i++){
	char c = s.charAt(i);
	if(Character.isLowerCase(c)){
		System.out.print(Character.toUpperCase(c));
	}else{
		System.out.print(Character.toLowerCase(c));
	}
}System.out.println();
}
}