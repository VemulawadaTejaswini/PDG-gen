import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		String syaink = sc.nextLine();
       if(Character.isUpperCase(syaink.charAt(0))){
         System.out.println("A");
       }else{
         System.out.println("a");
         }
}
}