import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1,n2,n3;
        n1 = n/100;
        n2 = (n-n1*100)/10;
        n3 = (n-n1*100-n2*10);
        if(n1==7||n2==7||n3==7){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        }
        }
