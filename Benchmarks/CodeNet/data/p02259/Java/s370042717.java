import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,c,j,count=0,N;
        N=sc.nextInt();
        int[] array;
        array= new int[N];
        for(i=0;i<=N-1;i++){
            array[i]=sc.nextInt();
        }
        for(j=1;j<=N-1;j++){
            for(i=N-1;i>=j;i--){
                if(array[i]<array[i-1]){
                    c=array[i];
                    array[i]=array[i-1];
                    array[i-1]=c;
                    count++;
                }else{
                    continue;
                }
            }
        }
        for(i=0;i<N-1;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(array[N-1]+"\n"+count);
    }
}
