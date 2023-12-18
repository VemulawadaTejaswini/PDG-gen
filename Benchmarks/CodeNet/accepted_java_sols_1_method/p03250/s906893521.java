import java.util.*;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();
int C = sc.nextInt();

int answer=A+B+C+9*Math.max(Math.max(A,B),C);

System.out.println(answer);
}
}
