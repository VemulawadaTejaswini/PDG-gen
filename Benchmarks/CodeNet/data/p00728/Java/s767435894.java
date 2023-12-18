import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n,i,sum=0,ave,max=0,min=1000;
        int[] s;

        s=new int[100];

        while(true){
            n=scan.nextInt();
            if(n==0){
                break;
            }

            for(i=0;i<n;i++){
                s[i]=scan.nextInt();
                sum+=s[i];

                if(s[i]>max){
                    max=s[i];
                }
                if(s[i]<min){
                    min=s[i];
                }
            }

                ave=(sum-max-min)/(n-2);
                System.out.println(ave);

                max=0;
                min=1000;
                sum=0;
        }

    }
}
