import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] s = new String[1030];
		String[] ans = new String[1030];
		int n=0;
		int count=0;
		
		while(sc.hasNext()){
			s[n] = sc.next();
			if(s[n].length()==7){
				String t = s[n].substring(6,7);
				if(t.compareTo(",")==0 || t.compareTo(".")==0){
					ans[count]=s[n].substring(0,6);
					count++;
				}	
			}else if(s[n].length()==3){
				String t = s[n].substring(2,3);
				if(t.compareTo(",")!=0 && t.compareTo(".")!=0){
					ans[count]=s[n].substring(0,3);
					count++;
				}	
			}else if(s[n].length()>3 && s[n].length()<7){
				String t = s[n].substring(s[n].length()-1,s[n].length());
				if(t.compareTo(",")==0 || t.compareTo(".")==0){
					ans[count]=s[n].substring(0,s[n].length()-1);
					count++;
				}else{
					ans[count] = s[n];
					count++;
				}
			}
			n++;
	
		}
		
		for(int i=0;i<count;i++){
			if(i!=0)System.out.print(" ");
			System.out.print(ans[i]);
		}
		System.out.println();

	}
}