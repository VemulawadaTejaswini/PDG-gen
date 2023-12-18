import java.util.Scanner;
class Main {
    public   static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            if (op.equals("replace")) {
                int a = sc.nextInt() ;
                int b = sc.nextInt() ;
                String p = sc.next();
                String newText = "";
                newText = text.substring(0,a);
                 newText += p;
                 newText += text.substring(b+1,text.length());
                text = newText;
            }else if(op.equals("reverse")){
                String p = "";
                String newText = "";
                int a = sc.nextInt();
                int b = sc.nextInt();
                for (int j = b; j >= a; j--) {
                    p += text.charAt(j);
                }
                newText = text.substring(0,a);
                newText += p;
                newText += text.substring(b+1,text.length());
                text = newText;
            }else if(op.equals("print")){
                int a = sc.nextInt(); int b = sc.nextInt();
                for (int j = a; j <= b; j++) {
                    System.out.print(text.charAt(j));
                }
                System.out.println();
            }
        }
                
    }

}
