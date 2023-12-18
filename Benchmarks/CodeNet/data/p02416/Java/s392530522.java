import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
           String x;
           x=sc.nextLine();
           if(x.equals("0"))break;
           int n=x.length();
           int ans=0;
           for(int i=0;i<n;i++){
                int dig=x.charAt(i)-'0';
                ans+=dig;
           }
           System.out.println(ans);
}
}
}
