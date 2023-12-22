import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        boolean b=true;
        while(n%4!=0){
            n-=7;
            if(n<0){
                b=false;
                break;
            }
        }
        if(b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }      
}