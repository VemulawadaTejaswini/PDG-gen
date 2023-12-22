import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int[] a=new int[N];
        int flag=0;
        int i;
        int count=0;
        for(i=0;i<N;i++){
            a[i]=scan.nextInt();
            if(a[i]%2==1){
                flag++;
            }
        }
        if(flag!=0){
            System.out.println("0");
            return;
        }
        else{
            flag=0;
            while(flag==0){
                for(i=0;i<N;i++){
                    if(a[i]%2==1){
                        flag++;
                        break;
                    }
                    a[i]/=2;
                    //System.out.println(a[i]+":");
                }
                if(flag==0){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}