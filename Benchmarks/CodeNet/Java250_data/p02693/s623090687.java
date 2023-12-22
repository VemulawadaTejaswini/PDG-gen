import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean ans=false;
        for (int d=a;d<=b;d++){
            if(d%k==0){
                ans=true;
                break;
            }
        }
        if(ans){
            System.out.println("OK");
        }
        else{
            System.out.println("NG");
        }
   
    }
}