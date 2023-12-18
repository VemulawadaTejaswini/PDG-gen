import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	while(n!=0){
	    String str = sc.next();
	    char[] c = str.toCharArray();
	    for(int i=0; i<n; i++){
		int a = sc.nextInt();
		int b = sc.nextInt(); 

		char tmp = c[a-1];
		c[a-1] = c[b-1];
		c[b-1] = tmp;

		int diff = b-a;

		//System.out.println("diff:"+diff);
		//System.out.println(c[a-1] +" "+ c[b-1] +" "+new String(c));

		if(c[a-1]+diff>'z'){c[a-1] = (char)(c[a-1]+diff-26);}
		else {c[a-1] = (char)(c[a-1]+diff);}

		if(c[b-1]+diff>'z'){c[b-1] = (char)(c[b-1]+diff-26);}
		else {c[b-1] = (char)(c[b-1]+diff);}
		//System.out.println(c[a-1] +" "+ c[b-1] +" "+new String(c));
	    }
	    System.out.println(new String(c));
	    System.out.println();
	    n = sc.nextInt();
	}
    }
}