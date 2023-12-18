import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=3000;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<b){
                System.out.printf("%d %d\n",a,b);
            }else if(a>b){
                System.out.printf("%d %d\n",b,a);
            }else if(a==b && a!=0){
                System.out.printf("%d %d\n",a,b);
            }else{
                break;
            }
        }
    }
}

