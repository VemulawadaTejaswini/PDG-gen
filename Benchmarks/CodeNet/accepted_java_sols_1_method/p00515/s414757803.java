import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] t= {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
       int sum=0;
       for(int i:t) {
           sum+=i<40?40:i;
       }
       System.out.println(sum/5);
    }
}
