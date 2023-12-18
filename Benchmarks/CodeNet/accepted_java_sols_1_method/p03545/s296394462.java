import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int [] num = new int[4];
        for(int i=0; i<4; i++){
            num[i] = Character.getNumericValue(S.charAt(i));
        }
        int a = num[0];
        int b = num[1];
        int c = num[2];
        int d = num[3];
        
        if(a+b+c+d == 7){
            System.out.println(a+"+"+b+"+"+c+"+"+d+"=7");
        }else if(a+b+c-d == 7){
            System.out.println(a+"+"+b+"+"+c+"-"+d+"=7");
        }else if(a+b-c+d == 7){
            System.out.println(a+"+"+b+"-"+c+"+"+d+"=7");
        }else if(a-b+c+d == 7){
            System.out.println(a+"-"+b+"+"+c+"+"+d+"=7");
        }else if(a+b-c-d == 7){
            System.out.println(a+"+"+b+"-"+c+"-"+d+"=7");
        }else if(a-b+c-d == 7){
            System.out.println(a+"-"+b+"+"+c+"-"+d+"=7");
        }else if(a-b-c+d == 7){
            System.out.println(a+"-"+b+"-"+c+"+"+d+"=7");
        }else{
            System.out.println(a+"-"+b+"-"+c+"-"+d+"=7");
        }

    }
}
