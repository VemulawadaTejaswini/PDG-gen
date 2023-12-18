import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String  A = sc.next();
    char[] a = A.toCharArray();
    ArrayList<Character> aa = new ArrayList<>();

	for(int i=0; i<4; i++){
	if(!aa.contains(a[i])){
		aa.add(a[i]);
	}
}
	if(aa.size() == 2){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
	}
}
