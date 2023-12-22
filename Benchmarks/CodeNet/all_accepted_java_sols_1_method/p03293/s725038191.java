import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	String T = sc.next();
	String newS = S;
	int lastSmoji =  S.length();
	boolean b = true;
	//System.out.println(newS.substring(lastSmoji-1,lastSmoji));
	//System.out.println(newS.substring(0, lastSmoji-1));

	for(int i = 0;i < S.length();i++){
	newS = newS.substring(lastSmoji-1,lastSmoji)+newS.substring(0, lastSmoji-1);
	if(T.equals(newS)){
		System.out.println("Yes");
		b = false;
		break;
	}
	}

	if(b){
		System.out.println("No");		
	}

	}
}
	

