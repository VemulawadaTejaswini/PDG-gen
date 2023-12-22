import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[]nn = n.toCharArray();

        for(int i=0; i<3; i++){               
            if(nn[i]=='1'){
                System.out.print('9'); 
            }else{
                System.out.print('1');                 
            }
 	    }
}
}
