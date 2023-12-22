import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt(),n;boolean x ;
        for(int i=1;i<a+1;i++){
            n=i;x=false;
            if(n%3==0)x=true;
            while(n>0){
                if(n%10==3)x=true;
                n/=10;
            }
            if(x)System.out.printf(" %d",i);
        }
        System.out.println();
    }
}
