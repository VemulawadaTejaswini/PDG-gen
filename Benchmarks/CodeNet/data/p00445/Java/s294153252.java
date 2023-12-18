import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
    while(sc.hasNextLine()){
    	String s=sc.nextLine();
    	char[]c=s.toCharArray();
    	int joi=0,ioi=0;
    	for(int i=0;i<s.length()-2;i++){
    		if(c[i+1]=='O'&&c[i+2]=='I'){
    			if(c[i]=='J') joi++;
    			else if(c[i]=='I') ioi++;
    		}
    	}
    System.out.println(joi);
    System.out.println(ioi);
    }
    }
}