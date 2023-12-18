import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	while(true){
		if(!cin.hasNext()){
			break;
		}
		String s=cin.nextLine(),ans="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='@'){ 
				for(int q=0;q<s.charAt(i+1)-48;q++){
					ans=ans+s.charAt(i+2);
				}
				i=i+2;
			}
			else if(s.charAt(i)!='@'){
				ans=ans+s.charAt(i);
			}
		}
		System.out.println(ans);
	}
	}

}