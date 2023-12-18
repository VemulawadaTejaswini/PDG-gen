import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        boolean ans =false;
        for(int i=A;i<=B;i++){
            if(i%N==0){
                ans=true;
                break;
            }
        }
        if(ans)
        System.out.println("OK");
        else
        System.out.println("NG");
    }
}