import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = -1;
        for(int i=12;i<=1000;i++){
            if(i*8/100==A&&i/10==B){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}