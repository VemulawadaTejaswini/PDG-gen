import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
    	Scanner sc = new Scanner(System.in);
		// 整数の入力
		String str = sc.nextLine();
        int count=0;
		for(int i=0;i<3;i++){
		    if(str.charAt(i)=='o'){
		        count++;
		    }
		}
		System.out.println(700+count*100);
		
    }
}
