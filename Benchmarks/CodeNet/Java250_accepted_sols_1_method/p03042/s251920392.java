import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int mae = n/100;
    int usiro = n-mae*100;
    
    if(mae>0 && mae<=12 && usiro>0 && usiro<=12) {
    	System.out.print("AMBIGUOUS");
    }else if(mae>0 && mae<=12 && usiro==0) {
    		System.out.println("MMYY");
    }else if(mae>0 && mae<=12 && usiro>12) {
		System.out.println("MMYY");
    }else if(usiro>0 && usiro<=12 && mae==0) {
		System.out.println("YYMM");
    }else if(usiro>0 && usiro<=12 && mae>12) {
    	System.out.println("YYMM");
    }else {
    	System.out.println("NA");
    }
    }
}