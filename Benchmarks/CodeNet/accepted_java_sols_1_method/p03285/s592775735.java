import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int upper = N/4;
        for(int i=0;i<=upper;i++){
            if((N-i*4)%7==0){
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
    }
}