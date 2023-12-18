import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		while(true) {
        int m = sc.nextInt();
        int f = sc.nextInt();
        int r = sc.nextInt();
        if(m == -1 && f >= 30 || f == -1 && m >= 30 || m + f < 30 && m + f >= 0){
            System.out.println("F");
        }else if (m + f >= 80 || m >= 80 && f >= 0 || f >= 80 && m >= 0){
            System.out.println("A");
        }else if(m + f >= 65 || m >= 65 && f >= 0 || f >= 65 && m >= 0 && m + f < 80){
            System.out.println("B");
        }else if(m + f >= 50 || m >= 50 && f >= 0 || f >= 50 && m >= 0 && m + f < 65 || r >= 50){
            System.out.println("C");
        }else if(m + f >= 30 || m >= 30 && f >= 0 || f >= 30 && m >= 0  && m + f < 50){
            System.out.println("D");
        }else{
            break;
        }
        
		}
	        
    }
}
