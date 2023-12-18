import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int first=0, second=0, third=0, current;
        Scanner input = new Scanner(System.in);
        for(int i=0;i<10;i++){
            current = input.nextInt();
            if(current>third){
                if(current > second){
                    third = second;
                    if(current > first){
                        second = first;
                        first = current;
                    }
                    else
                        second = current;
                }
                else 
                    third = current;
            }
        }
        System.out.printf("%d\n%d\n%d", first, second, third);
    }
}