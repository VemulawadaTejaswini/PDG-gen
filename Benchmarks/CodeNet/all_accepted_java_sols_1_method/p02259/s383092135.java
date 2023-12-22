import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt();
        int[] a=new int[length];
        for(int i=0;i<length;i++){
            a[i]=scan.nextInt();
        }
        int flag=1;
        int count=0;
        while(flag==1){
            flag=0;
            for(int j=length-1;j>=1;j--){
                if(a[j]<a[j-1]){
                    int tmp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=tmp;
                    flag=1;
                    count++;
                }
            }
        }
        for(int i=0;i<length;i++){
            if(i!=length-1) System.out.printf("%d ",a[i]);
            else System.out.printf("%d",a[i]);
        }
        System.out.println();
        System.out.println(count);
    }
}
