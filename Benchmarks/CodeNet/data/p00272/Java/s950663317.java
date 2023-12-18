import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            int t,n;
            t=sc.nextInt();
            n=sc.nextInt();
            if(t==1){
                System.out.println(6000*n);
            }else if(t==2){
                System.out.println(4000*n);
            }else if(t==3){
                System.out.println(3000*n);
            }else{
                System.out.println(2000*n);
            }
        }
    }
}
