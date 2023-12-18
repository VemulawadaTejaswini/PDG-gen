import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
int l=sc.nextInt();
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int ja=a/c; if(a%c!=0)ja++;
int ma=b/d;if(b%d!=0)ma++;
System.out.println(l-Math.max(ma, ja));
}
}