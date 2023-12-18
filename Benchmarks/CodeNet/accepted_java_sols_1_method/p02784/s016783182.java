import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int[] an = new int[n];
        for(int i=0;i<n;i++){
            an[i] = Integer.parseInt(sc.next());
        }
        int sum  = 0;
        for(int j : an){
            sum = sum + j;
        }
        if(sum < h){
            System.out.println("No");
        }else{
            System.out.println("Yes");

        }

    }
}