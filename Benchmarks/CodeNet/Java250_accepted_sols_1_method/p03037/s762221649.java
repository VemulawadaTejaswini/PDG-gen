
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int m=in.nextInt();
        int min=1, max=n;
        boolean flag=false;
        for(int i=0;i<m;i++){
            int lb=in.nextInt();
            int ub=in.nextInt();

            if(lb>=min)
                min=lb;
            if(ub<=max)
                max=ub;

            if(ub<min || lb >max){
                flag=true;
            }

        }
        if(flag)
            System.out.println(0);
        else {
            int ans = max - min + 1;
            System.out.println(ans);
        }
    }
}
