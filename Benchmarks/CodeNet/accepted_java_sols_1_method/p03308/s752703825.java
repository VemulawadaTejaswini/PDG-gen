import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=Integer.parseInt(sc.next());
int[] A=new int[N];
for(int i=0;i<N;i++){
A[i]=Integer.parseInt(sc.next());
}
Arrays.sort(A);
int max=A[N-1]-A[0];
System.out.println(max);

}
}