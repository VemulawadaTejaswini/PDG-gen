import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	String out = "No";
      	for(int i = 1; i<10; i++){
          if(a%i == 0 && a/i < 10){
			out = "Yes";
              break;
          }
        }
      	System.out.println(out);
    
    }




}