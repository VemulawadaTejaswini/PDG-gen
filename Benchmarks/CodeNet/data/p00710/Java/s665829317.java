import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array3 = new int[100];
        int count=0;
        for(int i=0; ;i++){
            int n=sc.nextInt();
            int[] array = new int[n];
            for(int j=1;j<=n;j++){
                array[j-1]=n-j+1;
            }
            int r=sc.nextInt();
            if((n==0)&&(r==0)){
                break;
            }
            for(int j=1;j<=r;j++){
                int p=sc.nextInt();
                int c=sc.nextInt();
                int[] array2 = new int[c];
                for(int k=1;k<=c;k++){
                    array2[k-1]=array[p+k-2];
                }
                for(int k=1;k<=p-1;k++){
                    array[p+c-k-1]=array[p-k-1];
                }
                for(int k=0;k<=c-1;k++){
                    array[k]=array2[k];
                }
            }
            array3[i]=array[0];
            count++;
        }
        for(int i=0;i<=count-1;i++){
            System.out.println(array3[i]);
        }
    }
}
