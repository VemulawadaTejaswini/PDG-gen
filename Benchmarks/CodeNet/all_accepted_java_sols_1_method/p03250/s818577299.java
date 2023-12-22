import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    
    int saidai = Math.max(Math.max(A,B),C);
    int all = A+B+C;
    int tyuusyou =all-saidai;
    
    System.out.println(saidai*10+tyuusyou);
    }
}
