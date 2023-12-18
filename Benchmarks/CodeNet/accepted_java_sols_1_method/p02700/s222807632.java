import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        while(true){
            c-=b;
            if(c<=0){
                System.out.println("Yes");
                break;
            }
            a-=d;
            if(a<=0){
                System.out.println("No");
                break;
            }
        }
    }
}