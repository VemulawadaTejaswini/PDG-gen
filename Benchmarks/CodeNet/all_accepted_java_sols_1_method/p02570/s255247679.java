import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int T = sc.nextInt();
        int S = sc.nextInt();
        
        int E = T * S;
        if(E>=D){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}