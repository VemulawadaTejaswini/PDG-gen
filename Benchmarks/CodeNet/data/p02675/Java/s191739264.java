import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int syaink = sc.nextInt();
        if(syaink%10==3){
          System.out.println("bon");
        }else if(syaink%10==0||syaink%10==1||syaink%10==6||syaink%10==8){
          System.out.println("pon");
        }else{
          System.out.println("hon");
        }
}
}