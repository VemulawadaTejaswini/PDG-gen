import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String S = new Scanner(System.in).nextLine();
        int i=0;
        while(i<S.length()){
            //System.out.println(i);
            if(S.charAt(i)!='R' && S.charAt(i)!='U' && S.charAt(i)!='D'){
                System.out.println("No");
                System.exit(0);
            }
            i+=2;
        }
        i=1;
        while(i<S.length()){
            //System.out.println(i);
            if(S.charAt(i)!='L' && S.charAt(i)!='U' && S.charAt(i)!='D'){
                System.out.println("No");
                System.exit(0);
            }
            i+=2;
        }
        System.out.println("Yes");
    }
} 