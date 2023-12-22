import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S  = sc.next();
    char[]ss = S.toCharArray();
    int[]a = new int[S.length()];
    int[]z = new int[S.length()];
    
    for(int i=0; i<S.length(); i++) {
    	if(ss[i] == 'A') {
    		a[i]++;
    	}else if(ss[i] == 'Z'){
    		z[i]++;
    	}
    }
    int A = 0, Z = 0;
    for(int i=S.length()-1; i>=0; i--) {
    	if(a[i] == 1) {
    		A = i;
    	}
    }
    	for(int i=0; i<S.length(); i++) {
        	if(z[i] == 1) {
        		Z = i ;
        	}
    	}
        	System.out.println(Z-A+1);
    }
}
