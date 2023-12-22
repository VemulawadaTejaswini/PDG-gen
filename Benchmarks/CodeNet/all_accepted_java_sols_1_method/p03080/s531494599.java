import java.util.*;

class Main {
	public static void main(String[] args){
	int a = 0;
	int b = 0;
	int i = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		 
	for(i = 0; i < S.length(); i++){
		if(String.valueOf(S.charAt(i)).equals("R")){
		    a += 1;
		}else{
			b += 1;
	    }
	}
	if(a > b){
	System.out.println("Yes");
	}else{
	System.out.println("No");
}
}
}
