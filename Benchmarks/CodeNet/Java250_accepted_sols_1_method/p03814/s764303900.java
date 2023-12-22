import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] chara = str.toCharArray();
		int a = 0;
		int z = 0;
		int ans = 0;
		
		for(int i=str.length()-1; i>=0; i--){
		    if(chara[i]=='A'){
		        a = i;
		    }
		}
		
		for(int i=0; i<str.length(); i++){
            if(chara[i]=='Z'){
                z = i;
            }
		}
		
		System.out.println(z-a+1);
	}
}
