import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c = 0;
        boolean a = false;
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                c = i*j;
                if(c == N) {
                    a = true;
                    break;
            }
        }
    }
    if(a == true) System.out.print("Yes");
    else System.out.print("No");

    }
}