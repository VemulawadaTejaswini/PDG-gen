    import java.util.Scanner;
    
    public class Main{
    public static void main(String args[]){
    String sS;
    	Scanner scan = new Scanner(System.in);
    sS=scan.nextLine();
    int j=0;
    boolean first=true;
    
    char[] cS = sS.toCharArray();
    
    for(int i=0;i<sS.length();i++){
    	while(cS[i]=='B' && first==true){
    		i++;
    	}
    	first=false;
    		
    	if(cS[i]=='B' && cS[i-1]=='B' && cS[i-2]=='B' && cS[i-3]=='B' && i-7>=0)cS[i-7]='a';
    	if(cS[i]=='B' && cS[i-1]=='B' && cS[i-2]=='B' && i-5>=0)cS[i-5]='a';
    	if(cS[i]=='B' && i!=0 && cS[i-1]!='B')cS[i-1]='a';
    	if(cS[i]=='B' && cS[i-1]=='B' && i-3>=0)cS[i-3]='a';
    }
    for(int i=0;i<sS.length();i++){
    	if(cS[i]!='a' && cS[i]!='B')System.out.print(cS[i]);
    }
    }
}