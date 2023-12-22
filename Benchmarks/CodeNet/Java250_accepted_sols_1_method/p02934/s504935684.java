import java.util.*;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
float f = 0;
float s=0;
Float a[]=new Float[N];
for(int i=0;i<N;i++){
f=sc.nextInt();
a[i]=1/f;
}
for(int i=0;i<N;i++){
s=s+a[i];
}
float T = 1/s;
System.out.println(T);
}
}