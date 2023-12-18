import java.util.Scanner;
public class Main {
	static int id;
static int minus(int a) {
	 if(a==0)return 2;
	 if(a==2)return 0;
	 return 1;
}

static int seki(int a,int b) {
	 if(a==0 || b==0) return 0;
	 if(a==2 && b==2) return 2;
	 return 1;
}

static int plus(int a,int b) {
	 if(a==2||b==2) return 2;
	 if(a==1||b==1) return 1;
	 return 0;
}

static int lastInd(String str,char ch1,char ch2) {
	 int n = 0;
	 for(int i=str.length()-1;i>0;i--) {
	  char c = str.charAt(i);
	  if(c=='(')
	   n++;
	  if(c==')')
	   n--;
	  if((ch1==c||ch2==c) && n==0)
	   return i;
	 }
	 return -1;
}

static int parse(String str) {
	 if(id==str.length())return 0;
	 if(Character.isDigit(str.charAt(id))) {
		 id++;
		  return Integer.parseInt(String.valueOf(str.charAt(id-1)));
	 }
	 if(str.charAt(id)=='-') {
		 id++;
		 return minus(parse(str));
	 }
	 if(str.charAt(id)=='(') {
		 id++;
		 int a = parse(str);
		 char c = str.charAt(id);
		 id++;
		 int b = parse(str);
		 id++;
		 if(c=='+') return plus(a,b);
		 else if(c=='*')return seki(a,b);
	 }
	 return 0;
 
}

public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 while(sc.hasNext()) {
	  String str = sc.next();
	  String str1 = str;
	  if(str.equals(".")) break;
	 
	  int cnt = 0;
	   for(int p=0;p<3;p++) {
	    for(int r=0;r<3;r++) {
	     for(int q=0;q<3;q++) {
	    	 str1 = str1.replaceAll("--","");
	    	 str1 = str.replace("P", String.valueOf(p)).replace("R", String.valueOf(r)).replace("Q", String.valueOf(q));
	    	 id = 0;
		     if(parse(str1)==2) {
		   	   cnt++;
		      }     
		      str1 = str;
	     }
	    }
	   }
	   System.out.println(cnt);
	  }	 
	}
}
