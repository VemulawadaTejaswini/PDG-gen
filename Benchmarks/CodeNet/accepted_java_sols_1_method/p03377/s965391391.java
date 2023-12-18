import  java.util.*;

 class Main {
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),x=sc.nextInt();
        if(a>x)
            System.out.println("NO");
        else{
            if(Math.abs(x-a)<=b)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
