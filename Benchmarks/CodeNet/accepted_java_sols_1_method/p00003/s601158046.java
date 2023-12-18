import java.util.Arrays;
import java.util.Scanner;
class Main{
public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
  int A[] = new int[3];
  int n1,n2,n3,caso;
caso=entrada.nextInt();
for(int i=0;i<caso;i++){
n1=entrada.nextInt();
n2=entrada.nextInt();
n3=entrada.nextInt();
A[0]=n1; A[1]=n2;  A[2]=n3;
    Arrays.sort(A);
if (((A[0]*A[0])+(A[1]*A[1]))==A[2]*A[2])
System.out.println("YES");else
System.out.println("NO");
}
}
}