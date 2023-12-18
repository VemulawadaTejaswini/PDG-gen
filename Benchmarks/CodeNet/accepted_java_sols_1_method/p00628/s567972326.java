import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);

        while(true){
        	String tmp=scan.nextLine();
        	if(tmp.equals("END OF INPUT"))break;
        	String [] line =tmp.split(" ");
        	for(String s :line)
        		System.out.print(s.length());
        	if(scan.hasNext())System.out.println();
        	
        }
    }
}