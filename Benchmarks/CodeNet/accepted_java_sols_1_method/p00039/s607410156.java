import java.util.Scanner;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	while (sc.hasNextLine()){
	String s=sc.nextLine();
    int []ara= new int[s.length()];
    char []roma=s.toCharArray();
    int ans=0,a=0;
    for(int i=0;i<s.length();i++){
		switch(roma[i]){
		case 'I':a=1; break;
		case 'V':a=5; break;
		case 'X':a=10; break;
		case 'L':a=50; break;
		case 'C':a=100; break;
		case 'D':a=500; break;
		case 'M':a=1000; break;
		}
		ara[i]=a;
	}
    if(s.length()<2){
    	ans=ara[0];
    }else
    for(int i=0;i<s.length();i++){
     if(i>0){
    	 if(ara[i-1]<ara[i])ans-=ara[i-1]*2;
     }
    	ans+=ara[i]; 
    }
	System.out.println(ans);
	}
    }
 }