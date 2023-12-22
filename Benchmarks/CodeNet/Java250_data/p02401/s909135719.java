import java.util.Scanner;
class Main{
    int a,b;
    String op;
    boolean sw = true;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\s");
        while (sw == true){
            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
            if(op.equals("+")){
                System.out.println(a + b);
            }else if(op.equals("-")){
                System.out.println(a - b);
            }else if(op.equals("*")){
                System.out.println(a * b);
            }else if(op.equals("/")){
                System.out.println(a / b);
            }else{
                sw = false;
            }
        }

    }
    public static void main(String[] args){
        new Main().solve();
    }
}