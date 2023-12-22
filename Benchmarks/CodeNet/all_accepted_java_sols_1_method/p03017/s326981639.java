import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int a = scn.nextInt();
      	int b = scn.nextInt();
      	int c = scn.nextInt();
      	int d = scn.nextInt();
      	String s = scn.next();
      	String s1 = s.substring(a-1, c);
        String s2 = s.substring(b-1, d);
        if(s1.contains("##") || s2.contains("##")){
            System.out.println("No");
        }else{
            if(d<n){
                s2 = s.substring(b-2, d+1);
            }else{
                s2 = s.substring(b-2, d);
            }
            if(d<c && !(s2.contains("..."))) {
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
	}
}