import java.util.Scanner;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
int A1 = sc.nextInt();
int min=A1;
int max=A1;
  for(int i=0;i<2;i++){
    int A = sc.nextInt();
    if(A>max)
    max=A;
    if(A<min)
    min=A;
  }

System.out.println(max-min);
}
}
