import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       if(str.charAt(str.length()-1)=='s')
    	   System.out.println(str+"es");
       else
    	   System.out.println(str+"s");
	}

}
