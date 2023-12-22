import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int max=-1000000000,res,min;
        int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        min=num[0];
        for(int i=1;i<n;i++){
            res=num[i]-min;
            if(res>max){
                max=res;
            }
            if(min>num[i]){
                min=num[i];
            }
        }
        System.out.println(max);
    }
}
