import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,c=0;
        do{
            a=sc.nextInt();
            c++;
            if(a!=0){
                System.out.printf("Case %d: %d\n",c,a);
            }
        }
        while(a!=0);
        sc.close();
    }
}
