import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int input = sc.nextInt();
      	int mod = 0;
       	while(input != 0){
        	mod = input % 10;
          	if(mod == 7){
              System.out.println("Yes");
              return;
            }
          	input = input / 10;
        }
        if(input % 10 == 7){
           System.out.println("Yes");
           return;
        }
      	System.out.println("No");
    }
}