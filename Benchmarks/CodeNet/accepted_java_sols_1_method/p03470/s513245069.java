import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(scanner.nextInt());
        }
        System.out.println(s.size());
    }
}