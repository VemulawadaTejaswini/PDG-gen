import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean c = true;

        for(int i = 0; i < n ;i++){
            int k = scan.nextInt();
            if(k % 2 == 0 && !(k % 3 == 0 || k % 5 == 0)) c = false;
        }
        scan.close();

        if(c) System.out.println("APPROVED");
        else System.out.println("DENIED");
    }
}