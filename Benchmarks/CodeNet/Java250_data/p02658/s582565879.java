import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        boolean b=true;
        int n=sc.nextInt();
        long l=1000000000;
        l*=l;
        long po=1;
        for(int i=0;i<n;i++){
            if(po==0){
                break;
            }else{
                long a=sc.nextLong();
                if((l/po>=a)){
                    po*=a;
                }else{
                    b=false;
                }
            }
        }
        System.out.println(b?po:(po==0)?0:-1);
    }
}
