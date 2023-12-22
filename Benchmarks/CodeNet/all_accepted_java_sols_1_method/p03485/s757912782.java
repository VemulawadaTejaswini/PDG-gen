    import java.util.Scanner;

    public class Main {
    	public static void main(String[] args){
    		 Scanner sc = new Scanner(System.in);

    		 double a = sc.nextFloat();
    		 double b = sc.nextFloat();
    		 double sum = a + b;
    		 if(sum % 2 == 1) {
    			 sum++;
    		 }
    		 int average = (int)sum /2;
    			 System.out.println(average);
    	}
    }