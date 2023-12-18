import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
try{
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if(a<b&&b<c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

}catch(Exception e){
    System.out.println(e);
}finally{
    scanner.close();
}

    }
    
}
