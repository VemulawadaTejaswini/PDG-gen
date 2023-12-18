import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			String s = sc.next();
			if(s.compareTo("#")==0)break;
			
			int now = 0;
			for(int i=0;i<s.length();i++){
				if(s.codePointAt(i)==48){
					if(now==0)now=1;
					else if(now==1)break;
					else if(now==2)now=1;
					else if(now==3)now=4;
					else if(now==4)now=5;
					else if(now==5)now=2;
				}else{
					if(now==0)now=2;
					else if(now==1)now=3;
					else if(now==2)break;
					else if(now==3)now=5;
					else if(now==4)now=2;
					else if(now==5)now=1;
				}
			}
			if(now==5){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
			
		}
	}
}