import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	Set<String> sss = new HashSet<String>();
	String f = sc.next();
	sss.add(f);
	String s = null;
	boolean isOk = true;
	
	for(int i=0;i<N-1;i++){
	    s=sc.next();
	    sss.add(s);
	    if(f.charAt(f.length()-1) != s.charAt(0)){
		isOk = false;
		break;
	    }
	    f = s;
	}
	if(isOk==true && sss.size()==N) System.out.print("Yes");
	else System.out.print("No");
    }
}
