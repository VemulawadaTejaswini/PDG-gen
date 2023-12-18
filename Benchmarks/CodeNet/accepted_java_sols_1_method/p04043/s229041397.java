import java.util.Scanner;


class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = 0;
        if(a==b){
            if(a<c){
                d = 1;
            }
        }
        else if(a==c){
            if(a<b){
                d = 1;
            }
        }
        else if(c==b){
            if(c<a){
                d = 1;
            }
        }
        
        if(d==1){
            System.out.println("YES"); 
        }
        else{
            System.out.println("NO"); 
        }
        scan.close();
    }
}