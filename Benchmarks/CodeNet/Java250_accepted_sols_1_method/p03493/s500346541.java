import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[]ss = S.toCharArray();
    
    int cou = 0;
    for(int i=0; i<3; i++) {
    	if(ss[i]=='1'){
    			cou++;
    	}
    }
    	 System.out.println(cou);
    }
}