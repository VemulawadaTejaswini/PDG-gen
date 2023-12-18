import java.util.Scanner;

public class Main {
    public static void main (String args[]){
    	int count=1;
    	while(true){

        Scanner sc = new Scanner(System.in);
    	    int a = sc.nextInt();
    	    if(1<=a&&a<=10000){
                  String i = Integer.toString(count);
                  String b = Integer.toString(a);
                  System.out.println("Case "+ i +": "+ b);

    	    }
    	    if(a==0){
    	    	break;
    	    }
            count++;
    	}
    }
}