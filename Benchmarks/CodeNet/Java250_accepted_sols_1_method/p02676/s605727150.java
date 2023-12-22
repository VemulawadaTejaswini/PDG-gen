import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
       int kazu=sc.nextInt();
       String moji = sc.nextLine();
	   moji = sc.nextLine();
      if(moji.length()<=kazu){
        System.out.println(moji);
      }else{
        System.out.println(moji.substring(0,kazu)+"...");
      }
}
}
