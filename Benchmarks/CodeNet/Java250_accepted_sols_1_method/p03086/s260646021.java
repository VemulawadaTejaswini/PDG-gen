import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int count=0;
        int max=0;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(c=='A'||c=='C'||c=='G'||c=='T') count++;
            else count=0;
            
            if(count>max) max=count;
        }
        System.out.println(max);
    }
}