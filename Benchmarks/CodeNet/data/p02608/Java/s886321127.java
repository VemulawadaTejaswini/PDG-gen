import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        //int anc = x*x + y*y + z*z + x*y + y*z + z*x;
        int count = 0;
        int x=1,y=1,z=1;
        int anc = x*x + y*y + z*z + x*y + y*z + z*x;

        for(int N = 1;N <= L;N++){
            f:for(x = 1;x <= 99;x++){
                for(y = 1;y <= 99;y++){
                    if(anc > 10000){
                        break f;
                    }
                    for(z = 1;z <= 99;z++){
                        if(N == x*x + y*y + z*z + x*y + y*z + z*x){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}