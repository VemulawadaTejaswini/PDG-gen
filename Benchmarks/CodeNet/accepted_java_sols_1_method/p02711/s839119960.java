import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        String ans = "No";
        for(int i = 0;i<3;i++ ){
        if((N%10)==7) {
        ans = "Yes";
        break;
        }
        else
        N = N/10;
        
        }
        System.out.println(ans);
    }
}