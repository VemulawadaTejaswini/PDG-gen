import java.util.Scanner;

class Main{
public static void main(String[] args){

	
	  int cnt=1;
	String  text1= "Case";
	String  text2=":";
 
	Scanner s = new Scanner(System.in);
while(s.hasNext())
	{
		int a=s.nextInt();
		if(a==0){break;}
		System.out.println(text1+" "+cnt + text2+" "+ a);
		cnt++;
		
		}
		
	}
}
