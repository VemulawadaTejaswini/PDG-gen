import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        long num = scan.nextInt();
        long sum = 0;
        for(int i =1; i <= num; i++){
            if(i % 3 == 0 && i % 5 == 0){
                //System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                //System.out.println("Fizz");
            }else if(i % 5 == 0){
                //System.out.println("Buzz");
            }else{
                //System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}