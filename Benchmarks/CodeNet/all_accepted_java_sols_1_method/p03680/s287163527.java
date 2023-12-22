import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int[] a=new int[N];
        int[] judge=new int[N];
        int i;
        int flag=0;
        int count=0;
        for(i=0;i<N;i++){
            a[i]=scan.nextInt();
            judge[i]=0;
            if(a[i]==2){
                flag++;
            }
        }
        if(flag==0){
            System.out.println("-1");
            return;
        }
        else{
            int j=0,light=1;
            while(light!=2){
                judge[j]++;
                if(judge[j]>1){
                    System.out.println("-1");
                    return;
                }
                count++;
                light=a[j];
                j=light-1;
            }
            System.out.println(count);
        }
    }
}