import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] array=new int[N];
        for(int i=0;i<N;i++) {
            int x=sc.nextInt();
            array[i]=x;
        }
        for(int i=1;i<array.length;i++) {
            for(int x=0;x<array.length-1;x++) {
                if(array[x]>array[x+1]) {
                    int y=array[x];
                    array[x]=array[x+1];
                    array[x+1]=y;
                }
            }
        }
        
        int sum=0;
        int sum2=0;
        int x=array.length-1;
        int y=array.length-2;
        while(x>=0) {
            sum=sum+array[x];
            x-=2;
        }
        while(y>=0) {
            sum2=sum2+array[y];
            y-=2;
        }
        
       System.out.println(sum-sum2);
       
    }
        

}