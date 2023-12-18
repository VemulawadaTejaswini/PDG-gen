import java.util.Scanner;

public class Main {
    public void main (String args[]){
    	Scanner str = new Scanner(System.in);
    	int a = str.nextInt();
    	int b = str.nextInt();
    	if (a>b){
    		System.out.println("a>b");
    	}

    	if (a<b){
    		System.out.println("a<b");
    	}

    	if (a==b){
    		System.out.println("a==b");
    	}

    }
}