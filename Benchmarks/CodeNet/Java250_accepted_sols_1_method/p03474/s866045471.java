import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        String S = sc.next();

        for(int i=0; i<A+B+1; i++){
            if(i==A && !S.substring(i,i+1).equals("-")){
                System.out.println("No");
                break;
            }
            else if(i!=A && S.substring(i,i+1).equals("-")){
                System.out.println("No");
                break;
            }
            if(i==A+B){
                System.out.println("Yes");
            }
        }
    } 
}