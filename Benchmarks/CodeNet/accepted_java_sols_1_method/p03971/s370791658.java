import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        char[] entry = scan.next().toCharArray();
        int count = 0;
        int nm = 0;

        for (int i = 0; i < entry.length; i++){
            switch (entry[i]){
                case 'a':
                    if ((a+b) > count) {
                        System.out.println("Yes");
                        count++;
                    }else {
                        System.out.println("No");
                    }
                    break;
                case 'b':
                    if ((a+b) > count && b > nm){
                        System.out.println("Yes");
                        count++;
                        nm++;
                    }else {
                        System.out.println("No");
                    }
                    break;
                case 'c':
                    System.out.println("No");
                    break;
            }
        }
    }
}
