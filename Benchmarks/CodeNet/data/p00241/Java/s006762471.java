import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            for(int i=0;i<n;i++){
                int x1=sc.nextInt();
                int y1=sc.nextInt();
                int z1=sc.nextInt();
                int w1=sc.nextInt();
                int x2=sc.nextInt();
                int y2=sc.nextInt();
                int z2=sc.nextInt();
                int w2=sc.nextInt();
                System.out.print(x1*x2-y1*y2-z1*z2-w1*w2+" ");
                System.out.print(x1*y2+y1*x2+z1*w2-w1*z2+" ");
                System.out.print(x1*z2-y1*w2+z1*x2+w1*y2+" ");
                System.out.println(x1*w2+y1*z2-z1*y2+w1*x2);
            }
        }
    }
}
