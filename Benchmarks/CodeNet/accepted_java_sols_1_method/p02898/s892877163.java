
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int t =in.nextInt();
            if(t>=k)
                count++;
        }
        System.out.println(count);
    }
}
