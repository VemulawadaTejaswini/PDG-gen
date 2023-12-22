import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str1 = in.nextLine();
    String str2;
    int num1 = Integer.parseInt(str1);
    int num2, max, min;
    max = 0;
    min = 0;
    long sum = 0;
    
    for (int i=0; i<num1; i++)
        {
        str2 = in.next();
        num2 = Integer.parseInt(str2);
        sum += num2;
        if (i == 0)
        {
        max = num2;
        min = num2;
        }else
        if (num2 > max){max = num2;}else
        if (num2 < min){min = num2;}
        }
    System.out.println(min +" "+ max +" "+ sum);
    
    }
    
}