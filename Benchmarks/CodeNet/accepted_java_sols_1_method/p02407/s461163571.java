import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        StringBuilder build = new StringBuilder();
        int n = input.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = input.nextInt();
        }
        for(int i = ar.length-1; i >= 0; i--){
            build.append(ar[i]);
            if(i==0){
                break;
            }
            build.append(" ");
        }
        System.out.println(build);
    }
}