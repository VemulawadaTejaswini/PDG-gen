import java.util.Scanner;


public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String beg = "zzz";
	int n = sc.nextInt();
	for(int i=0;i<n;i++){
     
	    String line = sc.next();
		if(i == 0) beg = line;
		else if(line.compareTo(beg) < 0) beg = line;
	  	
	}
	System.out.println(beg);
    }   
}