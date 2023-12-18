import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] f;
	int c=0, fb=0;
	f = new int[100];
	while(true){
	    String s = sc.nextLine();
	    System.out.println(s);
	    int l = s.length();
	    if(s.charAt(0)=='.') break;
	    outer:for(int i=0;i<l;i++){
		if(s.charAt(i)=='('){
		    f[c]=0; c++; fb=1; 
		}else if(s.charAt(i)=='['){
		    f[c]=1; c++; fb=1;
		}else if(s.charAt(i)==']'){
		    f[c]=2; c++; fb=1;
		    if(f[c-2]=='[') c-=-2;
		}else if(s.charAt(i)==')'){
		    f[c]=3; c++; fb=1;
		}
		while(fb==1 && c!=0 &&(f[c-1]==2 || f[c-1]==3)){
		    if(c==1) break outer;
		    else if((f[c-1]==2 && f[c-2]==1) || (f[c-1]==3 && f[c-2]==0)) c-=2;
		    else break;
		}
		fb=0;		
	    }
	    if(c==0) System.out.printf("yes\n");
	    else System.out.printf("no\n");
	    c=0;	    
	}	
    }
}