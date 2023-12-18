import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
	   
	   int i;
	   int gay;
	   //int sum=0;
	   String str;
	   
	   while(true){
		   int sum=0;
		str = in.nextLine();
		if(str.equals('0')){break;}
		for(i=0;i<str.length();i++){
		gay = str.charAt(i)-'0';
		sum=sum+gay;	
		}
		System.out.println(sum);}
}    
}