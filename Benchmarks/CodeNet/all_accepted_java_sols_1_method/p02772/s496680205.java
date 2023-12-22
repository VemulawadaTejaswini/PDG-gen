import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        boolean b = true;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            if(a[i] % 2 != 0){
                if(b){
                    b = true;
                }
            }else if(a[i] % 3 == 0 || a[i] % 5 == 0){
                if(b){
                    b = true;
                }
            }else{
                b = false;
            }
        }
        if(b){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }
    }
}