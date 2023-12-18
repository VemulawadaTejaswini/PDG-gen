import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(input.hasNext()){
    		String[] st = input.nextLine().split(" ");
    		int a = Integer.parseInt(st[0]);
    		int b = Integer.parseInt(st[2]);
    		if(st[1].equals("+")){
    			System.out.println((a+b));
    		}else if(st[1].equals("-")){
    			System.out.println((a-b));
    		}else if(st[1].equals("/")){
    			System.out.println((a/b));
    		}else if(st[1].equals("*")){
    			System.out.println((a*b));
    		}else{
    			break;
    		}
    	}
    }
}