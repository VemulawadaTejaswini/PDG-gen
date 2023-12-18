import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
        String b = "Yes";
        int c = a.length();
        for(int i=0;i<(c-1)/2;i++){if(a.charAt(i) == a.charAt(c-1-i) && a.charAt(i) == a.charAt((c-1)/2-1-i)){ }
                                  else{b = "No";break;}
                                  }
		System.out.println(b);
	}
}
