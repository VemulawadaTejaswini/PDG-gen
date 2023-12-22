import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
    int N= sc.nextInt();
    String C=sc.next();
    String c[]= C.split("",0);
    int last_R =(int)C.chars().filter(ch -> ch =='R').count();
    String C2= C.substring(0,last_R);
    long ans = C2.chars().filter(ch -> ch =='W').count();
    System.out.println(ans);  
    }
}