import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n, x;
        while(true){
            n = scan.nextInt();
            x = scan.nextInt();
            if(n == 0 || x == 0) break;
            System.out.println(calcCombi(n, x));
        }
    }
    public static int calcCombi(int n, int x){
        int i, j, k;
        int count = 0;
        for(i = 0; i <= (x / 3); i++){
            for(j = i + 1; j < n; j++){
                for(k = j + 1; k < n; k++) count++;
            }
        }
        return count;
    }
}
