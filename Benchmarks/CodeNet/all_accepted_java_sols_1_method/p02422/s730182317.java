import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int q = scanner.nextInt();

        int a, b;
        String op, p;
        StringBuffer sb;
        for(int i = 0; i < q; i++){
            op = scanner.next();
            a = scanner.nextInt();
            b = scanner.nextInt();

            if(op.equals("replace")){
                p = scanner.next();
                sb = new StringBuffer(str);
                sb = sb.replace(a, b+1, p);
                str = sb.toString();
            }
            else if(op.equals("reverse")){
                sb = new StringBuffer(str.substring(a, b+1));
                sb = sb.reverse();
                p = sb.toString();
                sb = new StringBuffer(str);
                sb = sb.replace(a, b+1, p);
                str = sb.toString();

            }

            else if(op.equals("print")){
                System.out.println(str.substring(a, b+1));
            }
        }

    }
}

