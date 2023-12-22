import java.util.Scanner;

public class Main{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	String str2 = in.nextLine();
	
	String str3 = str+str;
	boolean flag = false;
	for(int i=0;i<str.length();i++){
	    if(str2.compareTo(str3.substring(i,i+str2.length()))==0){
		flag =true;
		break;
	    }
	}
	if(flag)System.out.println("Yes");
	else System.out.println("No");
    }
}
       
	
	
