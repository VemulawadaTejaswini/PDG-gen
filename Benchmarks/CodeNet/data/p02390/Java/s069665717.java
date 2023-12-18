import java.util.Scanner;
class Main{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int time=sc.nextInt();
int h;
int m;
int s;
h=time/600;
m=(time -(h*600))/60;
s=time-((600*h)+(60*m));
System.out.println(h+":"+m+":"+s);
    }
}