import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int sum=0;
        for(int i=0;a<=b;a++){
            if(c % a==0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
