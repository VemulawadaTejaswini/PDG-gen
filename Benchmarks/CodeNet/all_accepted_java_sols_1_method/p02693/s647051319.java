import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		int k = sc.nextInt();
		int a = sc.nextInt();
      	int b = sc.nextInt();
		int i = 0;
        boolean iketaka = false;
      	for(i = a ; i <= b ; i++){
        	if(i%k == 0){
            	System.out.println("OK");
              	iketaka = true;
              	break;
            }
        	i += 1;
        }
		if(!iketaka){
          System.out.println("NG");
        }
		
	}
}