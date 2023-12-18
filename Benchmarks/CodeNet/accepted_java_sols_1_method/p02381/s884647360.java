import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=0;
        int ar[] = new int[1000];
        double sa=0;
        double a=0;
        double sum=0;
        while(true){
            num=sc.nextInt();
            if(num==0){
                break;
            }
            for(int i=0;i<num;i++){
                ar[i]=sc.nextInt();
                sa+=ar[i];
            }
            sa = sa/num;
            for(int i=0;i<num;i++){
                sum += Math.pow(ar[i] - sa, 2);
            }
            a=Math.sqrt(sum/num);
            System.out.println(a);
            sa=0;
            sum=0;
        }


        sc.close();
    }
}

