import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
	n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x,y,b,p,sum=0;
            x=sc.nextInt();
            y=sc.nextInt();
            b=sc.nextInt();
            p=sc.nextInt();
            if(b>=5&&p>=2){
                sum=((x*b+y*p)*4)/5;
            }else if(b>=5&&p<2){
                sum=x*b+y*p;
                if(sum>((x*b+y*2)*4)/5){
                    sum=((x*b+y*2)*4)/5;
                }
            }else if(b<5&&p>=2){
                sum=x*b+y*p;
                if(sum>((x*5+y*p)*4)/5){
                    sum=((x*5+y*p)*4)/5;
                }
            }else{
                sum=x*b+y*p;
            }
            System.out.println(sum);
        }
    }
}
