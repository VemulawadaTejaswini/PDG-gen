import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int A11 = scanner.nextInt();
        int A12 = scanner.nextInt();
        int A13 = scanner.nextInt();
        int A21 = scanner.nextInt();
        int A22 = scanner.nextInt();
        int A23 = scanner.nextInt();
        int A31 = scanner.nextInt();
        int A32 = scanner.nextInt();
        int A33 = scanner.nextInt();

        int N = scanner.nextInt();
        Set<Integer> b = new HashSet<>();
        for(int i=0; i<N; i++){
            b.add(scanner.nextInt());
        }

        boolean result = false;
        if(b.contains(A11) && b.contains(A12) && b.contains(A13)){result = true;}
        if(b.contains(A21) && b.contains(A22) && b.contains(A23)){result = true;}
        if(b.contains(A31) && b.contains(A32) && b.contains(A33)){result = true;}
        if(b.contains(A11) && b.contains(A21) && b.contains(A31)){result = true;}
        if(b.contains(A12) && b.contains(A22) && b.contains(A32)){result = true;}
        if(b.contains(A13) && b.contains(A23) && b.contains(A33)){result = true;}
        if(b.contains(A11) && b.contains(A22) && b.contains(A33)){result = true;}
        if(b.contains(A13) && b.contains(A22) && b.contains(A31)){result = true;}

        if(result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}