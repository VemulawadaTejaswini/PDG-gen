import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner( System.in );

        int x = Integer.parseInt( scan.next() );
        int y = Integer.parseInt( scan.next() );

        boolean flag = false;
        for(int i=0; i<= x; i++){
            if( ( 2*i + 4*(x-i) ) == y ){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}