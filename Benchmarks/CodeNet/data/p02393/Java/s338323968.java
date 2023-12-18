import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
if (a<b) {
    int z;
z=b;
b=a;
a=z;
}
if(b<c){
    int z;
    z=c;
    c=b;
    b=z;
}
if(a<b){
int z;
z=b;
b=a;
a=z;
}
System.out.println(c+" "+b+" "+a);

sc.close();
    }
}
