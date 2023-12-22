import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		int nam = s.length();
		char[] chars = s.toCharArray();
		
		int flag = 0;int flag1 = 0;
        for(int i = 0; i < nam ; i++){
            if(i%2==0 & chars[i] == 'L'){
               flag = 1;
            }else if(i%2!=0 & chars[i] == 'R'){
                flag1 = 1;
            }
        }
        if(flag1 == 0 && flag == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}
}
