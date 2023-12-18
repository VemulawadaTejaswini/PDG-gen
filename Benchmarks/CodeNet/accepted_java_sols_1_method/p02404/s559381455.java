import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        while(true){
            a=sc.nextInt();b=sc.nextInt();
            if(a==0 && b==0)break;
            for(int i=0;i<a;i++){
                if(i==0 || i==a-1){
                for(int j=0;j<b;j++){
                    System.out.print("#");
                }
                System.out.println();continue;
                }
                for(int j=0;j<b;j++){
                    if(j==0 || j==b-1)System.out.print("#");
                    else System.out.print(".");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
