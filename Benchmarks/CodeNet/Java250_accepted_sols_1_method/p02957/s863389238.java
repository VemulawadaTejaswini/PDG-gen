import java.util.Scanner;

class Main{
	public static void main(String[] args){
    	Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt();
        if((a+b)%2==0){
        	System.out.println(Math.abs((a+b)/2));
        }else{
        	System.out.println("IMPOSSIBLE");
        }
    }
}