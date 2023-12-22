import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cnt=0;
        int a=sc.nextInt();
        cnt+=a;
        int b=sc.nextInt();
        cnt+=b*5;
        int c=sc.nextInt();
        cnt+=c*10;
        int d=sc.nextInt();
        cnt+=d*50;
        int e=sc.nextInt();
        cnt+=e*100;
        int f=sc.nextInt();
        cnt+=f*500;
        
        if(cnt/1000!=0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
