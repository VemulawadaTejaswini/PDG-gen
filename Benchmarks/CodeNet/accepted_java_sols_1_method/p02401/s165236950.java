import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            while(true){
            int a= sc.nextInt();
            String b = sc.next();
            int c = sc.nextInt();
            int answer;


        switch(b){

        case"+":
        answer = a+c;
        break;

        case"-":
        answer = a-c;
        break;

        case"*":
        answer = a*c;
        break;
        
        case"/":
        answer = a/c;
        break;

        default:
        return;

        }
        

        System.out.println(answer);

    }
    
}
}
}
