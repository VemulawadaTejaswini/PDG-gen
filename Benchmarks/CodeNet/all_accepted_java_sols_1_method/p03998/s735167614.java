import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String Sa = sc.next();
        String Sb = sc.next();
        String Sc = sc.next();
        sc.close();

        int numA = Sa.length();
        int numB = Sb.length();
        int numC = Sc.length();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        
        char turn = 'a';

        while(true){
            if(turn == 'a'){
                if(countA == numA){
                    System.out.println('A');
                    break;
                }
                turn = Sa.charAt(countA);
                countA++;
            }
            if(turn == 'b'){
                if(countB == numB){
                    System.out.println('B');
                    break;
                }
                turn = Sb.charAt(countB);
                countB++;
            }
            if(turn == 'c'){
                if(countC == numC){
                    System.out.println('C');
                    break;
                }
                turn = Sc.charAt(countC);
                countC++;
            }    
        }
    }
}