import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        int ans = 0;
        if(x<600){ ans = 8; }
        else if(x<800){ ans = 7; }
        else if(x<1000){ ans = 6; }
        else if(x<1200){ ans = 5; }
        else if(x<1400){ ans = 4; }
        else if(x<1600){ ans = 3; }
        else if(x<1800){ ans = 2; }
        else if(x<2000){ ans = 1; }
        System.out.println(ans);
    }
}