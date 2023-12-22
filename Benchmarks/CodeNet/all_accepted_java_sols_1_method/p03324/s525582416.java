import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int D=sc.nextInt();
int N=sc.nextInt();

System.out.print((int) (Math.pow(100, D) * (N + N / 100)));



}
}