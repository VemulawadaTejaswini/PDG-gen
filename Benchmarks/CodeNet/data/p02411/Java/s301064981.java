import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int m, f, r, sub;
        for(int i = 0; i < 50; i++){
            m = scanner.nextInt();
            f = scanner.nextInt();
            r = scanner.nextInt();

            if(m == -1 && f == -1 && r == -1){
                break;
            }else if(m == -1 || f == -1){
                System.out.println("F");
            }else{
                sub = m + f;
                if(sub >= 80){
                    System.out.println("A");
                }else if(sub >= 65){
                    System.out.println("B");
                }else if(sub >= 50){
                    System.out.println("C");
                }else if(sub >= 30){
                    if(r >= 50){
                        System.out.println("C");
                    }else{
                        System.out.println("D");
                    }
                }else{
                    System.out.println("F");
                }
            }
        }
        scanner.close();
    }
}

