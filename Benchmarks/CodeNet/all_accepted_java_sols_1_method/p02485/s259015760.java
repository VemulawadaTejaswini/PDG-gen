import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
	   
	   int i;
	   int g;
	   //int sum=0;
	   //String str;
	   
	   while(true){
		   int sum=0;
		String str = in.nextLine();
		//System.out.println(str);
		if(str.equals("0")){break;}
		for(i=0;i<str.length();i++){
		g = str.charAt(i)-'0';
		sum=sum+g;	
		}
		System.out.println(sum);}
}    
}