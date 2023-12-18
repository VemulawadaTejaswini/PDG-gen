import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();

        while(N >= 500){
            N -= 500;
        }
        if(N <= A){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}