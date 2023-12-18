import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
 public static void main(String[] args){
	 String[] ch = {"a","b","c","d","e","f","g","h","i","j","k","l","n","m","o","p","q","r","s","t","u","v","w","x","y","z"};
	 String[] CH = {"A","B","C","D","E","F","G","H","I","J","K","L","N","M","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	 int[] con = new int[24];
	 Pattern p,P ;
	 Matcher m,M ;
	 String str = new java.util.Scanner(System.in).nextLine();
	 for(int i=0;i<24;i++){
		 p = Pattern.compile(ch[i]);
		 P = Pattern.compile(CH[i]);
		 m = p.matcher(str);
		 M = P.matcher(str);
		 if(m.find()||M.find()){
			 con[i]++;
		 }
	 }
	 for(int i=0;i<24;i++){
		 System.out.println(ch[i]+" :"+con[i]);
	 }
	 
 }
}