import java.util.*;

public class Main{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        String T = sc.next(), P = sc.next();
                        int i = 0;
                        while(true){
                                i = T.indexOf(P,i);
                                if(i==-1){
                                        break;
                                }
                                System.out.println(i);
                                i++;
                        }
                }
        }
}