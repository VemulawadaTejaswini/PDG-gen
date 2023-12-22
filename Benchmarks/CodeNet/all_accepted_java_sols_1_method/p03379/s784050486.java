import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] ary = new int[n];
        int[] ary_cp = new int[n];

        for(int i = 0; i < n; i++){
            ary[i] = stdIn.nextInt();
            ary_cp[i] = ary[i];
        }

        java.util.Arrays.sort(ary_cp);
        
        if(ary_cp[n / 2] == ary_cp[n / 2 - 1])
            for(int i = 0; i < n; i++)
                System.out.println(ary_cp[n / 2]);
        else{
            for(int i = 0; i < n; i++){
                if(ary[i] <= ary_cp[n / 2 - 1])
                    System.out.println(ary_cp[n / 2]);
                else
                    System.out.println(ary_cp[n / 2 - 1]);
            }
        }
    }
}