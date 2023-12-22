import java.util.*;
public class Main {
    public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     int A=s.nextInt();
     int B=s.nextInt();
     int C=s.nextInt();
     int ans=C-(A-B);
     if(ans<0)
         System.out.println(0);
     else {
         System.out.print(ans);
     }
    }
}