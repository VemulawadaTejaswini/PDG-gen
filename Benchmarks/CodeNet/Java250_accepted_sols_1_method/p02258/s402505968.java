import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int max=-1000000000,res,min=0,num;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            num=sc.nextInt();
            if(i==0){
                min=num;
            }else{
                res=num-min;
                if(res>max){
                    max=res;
                }
                if(min>num){
                    min=num;
                }
            }
        }
        System.out.println(max);
    }
}
