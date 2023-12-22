import java.util.*;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int D = sc.nextInt();
int s = D+D+1;
int p = N % s;
int f = N - p;
if(p==0){
System.out.println(f/s);
}else{
System.out.println(f/s+1);
}
}
}