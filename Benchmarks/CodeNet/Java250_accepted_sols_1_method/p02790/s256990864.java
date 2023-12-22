import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    String result = "";
   	if(a<b) {
   		for(int i=0;i<b;i++) {
   		result = result + a;
   		}
   	}else if(a>b) {   		
   		for(int i=0;i<a;i++) {
   		result = result + b;
   		}  		
   	}else {
   		for(int i=0;i<b;i++) {
   	   		result = result + a;
   	   		}
   	}
    System.out.println(result);
  }
}