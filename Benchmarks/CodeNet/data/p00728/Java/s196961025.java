import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array=new int[20];
        int c=0;
        for(int i=0;;i++){
            int n=sc.nextInt();
            int[] array2=new int[n];
            if(n==0){
                break;
            }
            int min=1001;
            int max=-1;
            int cmin=0,cmax=0;
            int S=0;
            for(int j=0;j<=n-1;j++){
                array2[j]=sc.nextInt();
                if(array2[j]<min){
                    cmin=j;
                    min=array2[j];
                }
                if(array2[j]>max){
                    cmax=j;
                    max=array2[j];
                }
            }
            System.out.println(cmin);
            System.out.println(cmax);
            for(int j=0;j<=n-1;j++){
                if((j==cmin)||(j==cmax)){
                    continue;
                }else{
                    S+=array2[j];
                }
            }
            array[i]=(int)S/n;
            S=0;
            c++;
        }
        for(int i=0;i<c;i++){
            System.out.println(array[i]);
        }
    }
}
