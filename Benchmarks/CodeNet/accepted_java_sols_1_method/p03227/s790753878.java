import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] list = S.toCharArray();
      
       if(list.length == 2){
         System.out.println(S);
       }else{
         for(int i = list.length-1; i >= 0; i-- ){
           System.out.print(list[i]);
         }
          System.out.println();
       }
	}

}