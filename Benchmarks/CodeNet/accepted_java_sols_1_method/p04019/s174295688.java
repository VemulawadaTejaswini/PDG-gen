import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.next();
			int n=0,s=0,e=0,w=0;
			for(int i=0;i<str.length();i++){
				char c=str.charAt(i);
				if(c=='N') n++;
				else if(c=='S') s++;
				else if(c=='E') e++;
				else w++;
			}
			if(n==0 && s!=0 || s==0 && n!=0) System.out.println("No");
			else if(e==0 && w!=0 || w==0 && e!=0) System.out.println("No");
			else System.out.println("Yes");
		}
	}
}