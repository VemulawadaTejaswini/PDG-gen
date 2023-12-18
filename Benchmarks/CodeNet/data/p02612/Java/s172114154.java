import java.util.Scanner;
 

    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();

    price = Integer.parseInt(str);
    System.out.println(price % 1000);

    scan.close();

