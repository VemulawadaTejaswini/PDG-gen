import java.util.*;

public class Main {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int p = 0;
            if(m == -1 && f == -1 && r == -1) break;
            if(m == -1 || f == -1){
                System.out.println("F");
            }else{
                p = m+f;
                if(p >= 80){
                    System.out.println("A");
                }else if(p >= 65){
                    System.out.println("B");
                }else if(p >= 50){
                    System.out.println("C");
                }else if(p >= 30){
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
        sc.close();
    }
}
