import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );

        for(int i=0; i<5; i++){
            if(Integer.parseInt(scan.next()) == 0  ){
                System.out.println(i+1);
            }            
        }

    }
}