import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int m1=sc.nextInt();
int d1=sc.nextInt();
int m2=sc.nextInt();
int d2=sc.nextInt();
if(m1==1 && d1==31 || m1==3 && d1==31 || m1==5 && d1==31 || m1==7 && d1==31 || m1==8 && d1==31 || m1==10 && d1==31 || m1==12 && d1==31 || m1==4 && d1==30 || m1==6 && d1==30 || m1==9 && d1==30 || m1==11 && d1==30 || m1==2 && d1==28)
System.out.println(1);
else
System.out.println(0);
}

}

