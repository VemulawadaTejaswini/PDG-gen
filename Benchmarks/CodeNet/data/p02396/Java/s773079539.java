
public class Main {
    public static void main(String[] args) {
    	int i = 1;
    	while(true){
    		 int x = new  java.util.Scanner(System.in).nextInt();
    		 if(x == 0){
    			 break;
    		 }
    		 System.out.println("Case" + " " + i + ":" + " " + x);
    		 i++;
    	}
    }
}