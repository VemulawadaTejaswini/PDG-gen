import java.util.Scanner;
  
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");
        long max = Integer.parseInt(str[0]);
        long total = Integer.parseInt(str[0]);
        long min = Integer.parseInt(str[0]);
        for(int cnt = 1; cnt < num; cnt++){
            if(max < Integer.parseInt(str[cnt])) max = Integer.parseInt(str[cnt]);
            if(min > Integer.parseInt(str[cnt])) min = Integer.parseInt(str[cnt]);
            total += Integer.parseInt(str[cnt]);
        }
        System.out.printf("%d %d %d\n", min, max, total);
    }
  
}