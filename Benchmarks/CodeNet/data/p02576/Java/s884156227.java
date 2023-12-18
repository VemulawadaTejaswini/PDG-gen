import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOf = input.nextInt();
        int numberAtATime = input.nextInt();
        int timeToMake = input.nextInt();

        int timeToMake2 = timeToMake * 2;


        if(Math.round((numberOf/numberAtATime)) > (((numberOf/numberAtATime))))
        {
            System.out.println((Math.round(timeToMake*(numberOf/numberAtATime))));
        }
        else
        {
            System.out.println(Math.round(timeToMake2*(numberOf/numberAtATime)));
        }
    }
}