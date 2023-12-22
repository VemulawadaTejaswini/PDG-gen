/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
7
500 600
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int k = sc.nextInt();
	int a = sc.nextInt();
	int b = sc.nextInt();
	boolean flag = false;
	for(int i = a;i<= b;i++){
	    if(i%k  == 0){
	        flag  = true;
	        break;
	    }
	    
	    }
	    
	    if(!flag){
	        System.out.println("NG");
	    }else
	     System.out.println("OK");
	}
	
	}

