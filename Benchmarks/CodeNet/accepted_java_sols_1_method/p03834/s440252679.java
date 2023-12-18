import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[]ss = S.toCharArray();

        for(int i=0; i<19; i++){
        if(ss[i] == ','){
            ss[i] = ' ';
            }
}
            System.out.println(String.valueOf(ss));    
    }
}