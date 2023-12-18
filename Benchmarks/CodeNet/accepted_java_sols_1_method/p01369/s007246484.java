import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String s = sc.next();
			if(s.compareTo("#")==0) break;
			boolean flag;
			int count = 0;
			int p ;
			
			p = s.codePointAt(0);
			if((104<=p && p<=112) || p==117 || p==121) flag = true;
			else flag = false;
			
			for(int i=1;i<s.length();i++){
				p = s.codePointAt(i);
				if((104<=p && p<=112) || p==117 || p==121){
					if(flag==false){
						flag = true;
						count++;
					}
				}else{
					if(flag==true){
						flag = false;
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}	
}