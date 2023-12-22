import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String input = sc.next();
if(input.charAt(0) != 'A'){
System.out.println("WA");
return;
}
int ccount = 0;
int cposition = 0;
for(int i = 2; i < input.length()-1;++i){
if(input.charAt(i) == 'C'){
ccount++;
cposition = i;
}
}
if(ccount != 1){
System.out.println("WA");
return;
}
String trimStr = input.substring(1, cposition) + input.substring(cposition + 1);
if(trimStr.equals(trimStr.toLowerCase()))
System.out.println("AC");
else
System.out.println("WA");

	}
}