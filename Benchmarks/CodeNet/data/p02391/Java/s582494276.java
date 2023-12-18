import java.util.Scanner;

class Main{

  public static void main(String[] args){

  Scanner scan = new Scanner(System.in);

  	public int a = scan.nextInt();
  	public int b = scan.nextInt();
  	
  	if(a < b){
  		System.out.println(a + " < " + b);
  	}else if(a > b){
  		System.out.println(a + " > " + b);
  	}else{
  		System.out.println(a + " = " + b);
    }
  }
}