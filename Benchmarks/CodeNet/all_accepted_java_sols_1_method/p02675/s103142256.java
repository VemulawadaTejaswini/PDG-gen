import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int ans = 0;
                String an = new Integer(N).toString();
                char t = an.charAt(an.length()-1);
                int a = Character.getNumericValue(t);
                
                if( a == 2 || a == 4 ||a == 5 ||a ==7 ||a == 9 ){
                    System.out.println("hon");
                }else if(a == 3){
                    System.out.println("bon");
                }else{
                    System.out.println("pon");
                }

        }
}