import java.util.*;
class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        if(a<=b){
            for(int i=0;i<b;i++){
                  System.out.print(a);
            }
        } else {
            for(int l=0;l<a;l++){
                    System.out.print(b);
            }
        }
    }
}