import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a;
        int b;

        while(true){
        System.out.print("a:");
        a = scanner.nextInt();
        System.out.print("b:");
        b = scanner.nextInt();

        if(1>a || a>100){
            System.out.println("あかん");
            continue;
        }

        if(1>b || b>100){
            System.out.println("あかん");
            continue;
        }

        break;

        }


        System.out.print(a*b);

        

        
    }

    
}