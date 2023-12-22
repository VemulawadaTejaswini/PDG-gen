import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);
int a=1,b=2;
int count=0;
int c=sc.nextInt();
int d=sc.nextInt();
for(int i=1;i<=c;i++){
    count+=(i-1);
}
for(int i=1;i<=d;i++){
    count+=(i-1);
}
System.out.println(count);
}
}