import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = 0;
  	int b = 0;
	a = sc.nextInt();
	b = sc.nextInt();
	String aB = "";
  	String bA = "";
 
  	for (int i= 0; i<b; i++){
      aB = aB + String.valueOf(a);
    }
    for (int i= 0; i<a; i++){
      bA = bA + String.valueOf(b);
    }
    
  	if(a<b){
      	System.out.println(aB);
    }else{
     	System.out.println(bA); 
    }
  
	}
}