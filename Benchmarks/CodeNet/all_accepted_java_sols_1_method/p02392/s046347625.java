import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a<0 || 100<a) || (b<0 || 100<b) ||(c<0 || 100<c)){
            System.exit(-1);
        }else if(a<b && b<c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}