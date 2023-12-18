import java.util.Scanner;
 
/**
 * Created by PC on 26-Nov-17.
 */
public class Main{
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
 
        int n, dig,tempDig, cnt;
 
        while(in.hasNext()){
            n = in.nextInt();
 
            dig = n%10;
            n/=10;
            cnt = 1;
            boolean goodNumber = false;
 
            while(n>0){
                tempDig = n%10;
                n/=10;
 
                if(tempDig == dig){
                    cnt++;
                    if(cnt >= 3) goodNumber = true;
                }
                else{
                    if(cnt >= 3) goodNumber = true;
                    cnt=1;
                    dig = tempDig;
                }
            }
 
            if(goodNumber) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}