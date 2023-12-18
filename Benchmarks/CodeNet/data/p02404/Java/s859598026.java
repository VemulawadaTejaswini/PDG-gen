import java.util.Scanner;
 
class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
         
        Scanner n=new Scanner(System.in);
         
        int a=n.nextInt();
        int b=n.nextInt();
         
        while (a!=0 || b!=0){
            for (int c = 0; c < a ; c++){
                for (int d = 0 ; d < b ; d++){
                    if(c == 0 || c == a - 1 || d == 0 || d == b - 1){
                    	sb.append("#");
                    } else{
                    	sb.append(".");
                    }
                }
                sb.append("\n");
                 
            }
            System.out.println(sb);
            a=n.nextInt();
            b=n.nextInt();
            sb=new StringBuilder("");
        }
    }
}