import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t;
        int n;
        int i;
        
        for(i = 0;i<4;i++){
         t = scan.nextInt();
         n = scan.nextInt();
       if(t == 1){
           System.out.println(6000*n);
       }else if (t == 2){
           System.out.println(4000*n);
       }else if (t == 3){
           System.out.println(3000*n);
       }else if (t == 4){
           System.out.println(2000*n);
       }
       
       }
           }
        
    }


