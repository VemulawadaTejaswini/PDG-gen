import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int max = 0;
        int total = 0;
        int tmp = 0;
        for(int i = 0;i<n;i++){
            tmp = sc.nextInt();
            total += tmp;
            max = Math.max(tmp,max);
        }
        if(total - max > max){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}