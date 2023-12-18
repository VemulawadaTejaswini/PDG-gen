
import java.util.Scanner;


public class Main{

	public class Main {
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        String w=sc.next();
	        int c=0;
	        while(sc.hasNext()){
	            String tem=sc.next();
	            if(tem.equals("END_OF_TEXT")) break;
	            tem=tem.toLowerCase();
	            if(tem.equals(w)){
	                c++;
	            }

	            }
	            System.out.println(c);

	    }
	}