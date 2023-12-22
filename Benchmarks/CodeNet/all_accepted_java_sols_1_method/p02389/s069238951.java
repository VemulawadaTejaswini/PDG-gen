import java.util.*;
class Main{
    public static void main(String[] args){
        int a,b,area,perimeter;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        area=a*b;
        perimeter=2*(a+b);
        
        System.out.printf("%d %d\n",area,perimeter);
    }
}



