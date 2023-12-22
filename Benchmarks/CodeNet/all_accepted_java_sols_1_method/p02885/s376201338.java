
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int openArea = A - B*2;



        if(openArea > 0){
            System.out.println(openArea);
        }else{
            System.out.println(0);
        }


    }
}




