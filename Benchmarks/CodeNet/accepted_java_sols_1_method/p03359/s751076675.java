import java.util.*;
    class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            long a = sc.nextInt();
            long b = sc.nextInt();

            if(b < a){
                a--;
            }
            System.out.println(a);
        }
    } 