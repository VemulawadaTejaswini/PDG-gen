import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
 for(int i = 0; i < 3;i++) {
	   total  = total + Integer.parseInt(sc.next());
 }
if(total <= 21) {
	System.out.println("win");
}else {
	System.out.println("bust");
}
        
        
       
        }
 
     
    }