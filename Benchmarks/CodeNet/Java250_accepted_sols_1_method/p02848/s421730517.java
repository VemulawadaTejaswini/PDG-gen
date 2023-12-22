import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    char[]ss = S.toCharArray();

    int an = 0;
    for(int i=0; i<S.length(); i++){
        an = ss[i]+N;
        if(an>90){
            an=ss[i]-26+N;
        }
    
	System.out.print((char)an);
    }
}
}
      