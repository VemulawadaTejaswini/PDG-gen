import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String t = scan.next();

	int len = 0;
	for(int i = 0; i < t.length(); i++){
	    if(t.charAt(i) == 'A' || t.charAt(i) == 'C' ||
	       t.charAt(i) == 'G' || t.charAt(i) == 'T'){
		int count = 1;
		for(int j = i+1; j < t.length(); j++){
		    if(t.charAt(j) == 'A' || t.charAt(j) == 'C' ||
		       t.charAt(j) == 'G' || t.charAt(j) == 'T'){
			count++;
		    }else{
			break;
		    }
		}
		if(len < count){
		    len = count;
		}
	    }
	}

	System.out.println(len);
    }
}
