import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] a=new int[3];
        for(int i=0;i<3;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
                if(a[i]>a[j]){
                    int tmp=a[j];
                    a[j]=a[i];
                    a[i]=tmp;
                }
            }
        }
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
    }
}
