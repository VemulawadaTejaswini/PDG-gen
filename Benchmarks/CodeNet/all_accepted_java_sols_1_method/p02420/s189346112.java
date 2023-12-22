import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	String before;
	int order;
	int num;
	String str1,str2;
	

	while(true){
	    before = in.next();
	   if(before.equals("-"))break;
	   num = in.nextInt();

	    for(int i=0;i<num;i++){
		order = in.nextInt();
	    
		str2 = before.substring(0,order);
		str1 = before.substring(order,before.length());
		before = str1+str2;
	    }
	    System.out.println(before);

	}
    }
}

