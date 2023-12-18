import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
      //０が何番目にいるのか探す
       for(int i=1;i<=5;i++) {
         
		 int X = sc.nextInt();
         
		 if(X==0) {
	     	System.out.println(i);
           
         }
       }
    }
}