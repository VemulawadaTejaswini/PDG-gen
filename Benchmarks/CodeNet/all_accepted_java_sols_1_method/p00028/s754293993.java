import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] data=new int[101];
        int[] out=new int[101];
        int i=1;
        int p;
        while(sc.hasNextInt()){
            p=sc.nextInt();
            data[p]++;
            out[i]=i;
            i++;
        }
        int temp1;
        int temp2;
        for(int n=1;n<i;n++){
            for(int m=n;m>1;m--){
                if(data[m]>data[m-1]){
                    temp1=data[m];
                    temp2=out[m];
                    data[m]=data[m-1];
                    out[m]=out[m-1];
                    data[m-1]=temp1;
                    out[m-1]=temp2;
                }else{
                    break;
                }
            }
        }
        System.out.println(out[1]);
        for(int n=2;n<i;n++){
            if(data[n-1]==data[n]){
                System.out.println(out[n]);
            }else{
                break;
            }
        }
    }
}