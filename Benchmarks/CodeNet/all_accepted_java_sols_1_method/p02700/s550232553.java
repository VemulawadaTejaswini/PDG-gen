import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int thp = sc.nextInt();
        int tat = sc.nextInt();
        int ahp = sc.nextInt();
        int aat = sc.nextInt();
        for(int i = 0; i < 100; i++){
        	ahp -= tat;
            if(ahp <= 0){
            	System.out.println("Yes");
                break;
            }
            thp -= aat;
            if(thp <= 0){
            	System.out.println("No");
                break;
            }
            
        }
    }
}