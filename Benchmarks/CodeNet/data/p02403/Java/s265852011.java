import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();

    	for(int x=1;x<=a;x++){
    		for(int y=1;y<=b;y++){
    		System.out.print("#");
    		}
    		System.out.println("");
    	}
    }
}

