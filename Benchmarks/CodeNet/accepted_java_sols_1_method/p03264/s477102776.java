import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans;
        if(N%2==0) ans = N*N/4;
        else ans = (N/2)*(N/2+1);
        System.out.println(ans); 
    }
}
