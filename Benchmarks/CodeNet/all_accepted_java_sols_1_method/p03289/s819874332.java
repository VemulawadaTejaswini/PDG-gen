import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String s = scan.next();

	if(s.charAt(0) != 'A'){
	    System.out.println("WA");
	}else{
	    int count = 0;
	    int point = 0;
	    for(int i = 2; i < s.length()-1; i++){
		if(s.charAt(i) == 'C'){
		    count++;
		    point = i;
		}
	    }
	    if(count != 1){
		System.out.println("WA");
	    }else{
		int flag = 1;
		for(int i = 0; i < s.length(); i++){
		    if(i == 0 || i == point){
			//何もしない
		    }else{
			if(s.charAt(i) < 'a' || s.charAt(i) > 'z'){
			    flag = -1;
			}
		    }
		}
		if(flag == 1){
		    System.out.println("AC");
		}else{
		    System.out.println("WA");
		}
	    }
	}
    }
}
