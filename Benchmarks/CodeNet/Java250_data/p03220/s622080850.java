import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int T  = sc.nextInt();
int A = sc.nextInt();
int H[] = new int[N];
for(int i =0;i<N;i++){
H[i] = sc.nextInt();
}

double min  = H[0];
int minidx = 0;
for(int i = 0;i < N;i++){
double tem = Math.abs(A -(T - H[i]*0.006));
if(min>tem){
min = tem;
minidx = i;
}
}
System.out.println(minidx + 1);

} 
}