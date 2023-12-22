import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String S = sc.next();
    char[]ss = S.toCharArray();

    int cou = 0;
    for(int i=0; i<a; i++) {
    	if(ss[i] == '-') {
    		cou++;
    	}
    }
    for(int i=a+1; i<a+b+1; i++) {
    	if(ss[i] == '-') {
    		cou++;
    	}
    }
    if(ss[a] == '-') {
    	if(cou==0) {
    		System.out.println("Yes");    
        }else{
            System.out.println("No");
        }
    }else{
        System.out.println("No");

    	}
    }
}
    
    