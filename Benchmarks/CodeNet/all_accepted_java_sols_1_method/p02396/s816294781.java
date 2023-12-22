import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=1;
        int x=1;
        while((x=scanner.nextInt()) != 0){
            System.out.println("Case "+num+": "+x);
            num++;
        }
    }
}
