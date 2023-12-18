import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int f = sc.nextInt();
        int r = sc.nextInt();

        while(true){
            if(m == -1 || f == -1){
                if(m == -1 && f == -1 && r == -1){
                    break;
                }else{
                    System.out.println("F");
                    break;
                }
            }else{
                if(m + f < 30){
                    System.out.println("F");
                    break;
                }else if(m + f < 50){
                    if(r < 50){
                        System.out.println("D");
                        break;
                    }else{
                        System.out.println("C");
                        break;
                    }
                }else if(m + f < 65){
                    System.out.println("C");
                    break;
                }else if(m + f < 80){
                    System.out.println("B");
                    break;
                }else{
                    System.out.println("A");
                    break;
                }
            }
        }
        sc.close();
    }
}
