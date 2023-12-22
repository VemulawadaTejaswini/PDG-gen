import java.util.*;
import java.lang.*;
public class Main{
        public static void main(String[]args){
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();scan.nextLine();
                String s = scan.nextLine();
                int sLength = 1;
                for(int i = 0; i < n-1; i++){
                        if(s.charAt(i) != s.charAt(i+1)){
                                sLength++;
                                }
                        }
                System.out.println(sLength);
                }
        }
