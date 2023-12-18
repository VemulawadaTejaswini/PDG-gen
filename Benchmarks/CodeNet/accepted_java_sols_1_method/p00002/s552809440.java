import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a, b;
        String result;
        
        while(scan.hasNext()){
            a=scan.nextInt();
            b=scan.nextInt();
            result=String.valueOf(a+b);
            System.out.println(result.length());
        }
    }
}
