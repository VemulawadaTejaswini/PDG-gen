import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String[] str = new String[N];
		int count=0;
      
		for(int i=0; i<N; i++){
			str[i] = String.valueOf(S.charAt(i));
			if(i==0||!(str[i].equals(str[i-1]))){
				count++;
            }
        }
		
		System.out.println(count);
    }
}
