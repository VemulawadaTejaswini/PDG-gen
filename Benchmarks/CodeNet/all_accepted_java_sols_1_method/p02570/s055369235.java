import java.util.*;
class Main{
    public static void main(String[] args){
        int d,t,s;
        Scanner sc =new Scanner(System.in);

        d=sc.nextInt();
        t=sc.nextInt();
        s=sc.nextInt();

        if(t*s>=d){
            System.out.println("Yes");
        }
        else
        { 
            System.out.println("No");
        }
    }

}