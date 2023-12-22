import java.util.*;

public class Main {
    public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         int a=scn.nextInt();
         int b=scn.nextInt();
         int c=scn.nextInt();
         int d=scn.nextInt();
         if(Math.abs(a-c)<=d||(Math.abs(a-b)<=d&&Math.abs(b-c)<=d)){
             System.out.println("Yes");
         }else{
             System.out.println("No");
         }
    }
}
