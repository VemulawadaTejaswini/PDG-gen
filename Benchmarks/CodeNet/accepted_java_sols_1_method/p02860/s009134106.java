import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        if(N%2==0){
            for(int i=0; i<N/2; i++){
                if(S.charAt(i)!=S.charAt(N/2+i)){
                    System.out.println("No");
                    break;
                }
                else if(i<N/2-1){
                    continue;
                }
                System.out.println("Yes");
            }
        }
        else if(N%2!=0){
            System.out.println("No");
        }
    }
}