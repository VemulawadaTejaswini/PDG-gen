import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        while(true){
            
            a=sc.nextInt();b=sc.nextInt();
            
            if(a==0 && b==0)break;
            
            for(int i=0;i<a;i++){
                
                if(i%2==0){
                    for(int j=0;j<b;j++){
                        if (j%2==0)System.out.print("#");
                        else System.out.print(".");
                    }
                }
                
                else{
                    for(int j=0;j<b;j++){
                        if (j%2==1)System.out.print("#");
                        else System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
