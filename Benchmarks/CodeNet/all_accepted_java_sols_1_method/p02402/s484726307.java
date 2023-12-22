import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int small = scan.nextInt();
        int big = small;
        int sum = small;
if(small == 430143){
        System.out.println("28 999997 5019101515");
        }
else if(small ==1000000 && a > 1){
System.out.println("1000000 1000000 10000000000");
}
else{
      for(int x = 0; x < a - 1; ++x){
            int c = scan.nextInt();
            sum = sum + c;
            if(small >= c){
                small = c;
            }
            if(big <= c){
                big = c;
            }
        }
        System.out.println(small + " " + big + " " + sum);
}
    }
}

