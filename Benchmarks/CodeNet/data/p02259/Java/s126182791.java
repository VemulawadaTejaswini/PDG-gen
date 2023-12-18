import java.util.Scanner;
public class practice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int []array=new int[N];
        for(int i=0;i<N;i++)array[i]=sc.nextInt();
        int num=0;
        for(int i=N;i>=1;i--){
            for(int j=0;j<i-1;j++){
                if(array[j+1]<array[j]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    num++;
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(array[i]);
            if(i<N-1)System.out.print(" ");
        }
        System.out.println();
        System.out.println(num);

        
    }
}
