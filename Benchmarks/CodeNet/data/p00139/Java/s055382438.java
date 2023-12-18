import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			String s = sc.next();
			StringBuffer t = new StringBuffer();
			if(s.length()<=5 || s.length()%2==1){
				System.out.println("NA");
			}else if(s.substring(0,2).compareTo(">'")==0 && s.substring(s.length()-1,s.length()).compareTo("~")==0){
				for(int k=0;k<(s.length()-4)/2;k++) t.append("=");
				t.append("#");
				for(int k=0;k<(s.length()-4)/2;k++) t.append("=");
				if(s.substring(2,s.length()-1).compareTo(t.toString())==0) System.out.println("A");
				else System.out.println("NA");
			}else if(s.substring(0,2).compareTo(">^")==0 && s.substring(s.length()-2,s.length()).compareTo("~~")==0){
				for(int k=0;k<(s.length()-4)/2;k++) t.append("Q=");
				if(s.substring(2,s.length()-2).compareTo(t.toString())==0) System.out.println("B");
				else System.out.println("NA");
			}else{
				System.out.println("NA");
			}
		}
	}	
}