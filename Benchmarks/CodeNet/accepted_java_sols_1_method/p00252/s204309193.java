import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int b1,b2,b3;
        b1=sc.nextInt();
        b2=sc.nextInt();
        b3=sc.nextInt();
        if((b1==1&&b2==0&&b3==0)||(b1==0&&b2==1&&b3==0)||(b1==0&&b2==0&&b3==0)){
            System.out.println("Close");
        }else{
            System.out.println("Open");
        }
    }
}
