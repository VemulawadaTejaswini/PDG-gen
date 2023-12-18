import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        boolean[] ary = new boolean[102];
        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            ary[temp] = true;
        }
        int i = 0;
        while(true){
            if(x-i >= 0 && !ary[x-i]){
                System.out.println(x-i);
                break;
            }
            if(x + i < 102 && !ary[x+i]){
                System.out.println((x+i));
                break;
            }
            i++;
        }
    }
}