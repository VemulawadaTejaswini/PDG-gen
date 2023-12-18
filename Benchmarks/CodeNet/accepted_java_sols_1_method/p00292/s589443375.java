import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            int h=sc.nextInt();
            if(k%h==0){
                System.out.println(h);
            }else{
                System.out.println(k%h);
            }
        }
    }
}
