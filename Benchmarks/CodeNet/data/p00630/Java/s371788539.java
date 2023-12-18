import java.util.Scanner;

public class Main{
	
	static String change(String s, String type, int num) {
		String ans="";
		if(type.equals("L")) {
			if(num==0) {
				ans = s.toLowerCase();
			}
			else {
				ans=String.valueOf(s.charAt(0)).toUpperCase();
				for(int i=1; i<s.length(); i++) {
					ans+=String.valueOf(s.charAt(i)).toLowerCase();
				}
			}
		}
		else if(type.equals("U")) {
				ans=String.valueOf(s.charAt(0)).toUpperCase();
				for(int i=1; i<s.length(); i++) {
					ans+=String.valueOf(s.charAt(i)).toLowerCase();
				}
			
		}
		else {
			if(num==0) {
				ans = s.toLowerCase();
			}
			else {
				ans = "_"+s.toLowerCase();
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  while(sc.hasNext()) {
				  String str=sc.next();
				  String type=sc.next();
				  if(type.equals("X")) break;
				  int num=0;
				  String ans="";
				  if(str.contains("_")) {
					  String[] tokens=str.split("_");
					  num=0;
					  for(String t:tokens) {
						  ans+=change(t, type, num);
						  num++;
					  }
				  }
				  else {
					  int start=0,last=0;
					  num=0;
					  for(int i=0; i<str.length(); i++) {
						  if(Character.isUpperCase(str.charAt(i)) && last==i) {
							  int index=str.length()-1;
							  for(int j=i+1; j<str.length(); j++) {
								  if(Character.isUpperCase(str.charAt(j))) {
									  index=j;
									  last=index;
									  ans+=change(str.substring(start, index), type, num);
									  num++;
									  start=index;
									  break;
								  }
							  }
						  }
						  else if(Character.isUpperCase(str.charAt(i))&& start!=i) {
							  last=i;
							  ans+=change(str.substring(start, i), type, num);
							  if(i!=0)num++;
							  start=i;
						  }
					  }
					  if(last<str.length()) {
						  ans+=change(str.substring(last, str.length()), type, num);
					  }
				  }
				  System.out.println(ans);
			  }
		  }
	}
}
